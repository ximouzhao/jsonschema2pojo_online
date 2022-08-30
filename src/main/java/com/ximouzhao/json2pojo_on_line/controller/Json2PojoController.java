package com.ximouzhao.json2pojo_on_line.controller;

import com.sun.codemodel.JCodeModel;
import com.ximouzhao.json2pojo_on_line.model.Json2PojoModel;
import com.ximouzhao.json2pojo_on_line.tool.FolderToZipUtil;
import com.ximouzhao.json2pojo_on_line.tool.IOCloseUtil;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

@Slf4j
@RestController
public class Json2PojoController {

    @Value("${project.tempdir}")
    private String tempDir;

    @Autowired
    private HttpServletResponse httpServletResponse;

    @RequestMapping("/generator/preview")
    public String preview(Json2PojoModel json2PojoModel) throws IOException {
        File file = generatePojoFile(json2PojoModel);
        StringBuilder stringBuilder = new StringBuilder();
        getWebsiteFile(file, stringBuilder);
        FileUtils.deleteDirectory(file);
        return stringBuilder.toString();
    }

    @RequestMapping("/generator")
    public void generator(Json2PojoModel json2PojoModel) throws IOException {
        File file = generatePojoFile(json2PojoModel);
        FolderToZipUtil.zip(file.getCanonicalPath(), json2PojoModel.getClassname(), httpServletResponse);
        File zipFile = new File(file.getCanonicalPath() + ".zip");
        if (!zipFile.delete()) {
            log.error("delete zip file failed, path={}", zipFile.getCanonicalPath());
        }
        FileUtils.deleteDirectory(file);
    }

    private File generatePojoFile(Json2PojoModel json2PojoModel) throws IOException {
        JCodeModel codeModel = new JCodeModel();
        GenerationConfig config = getGenerationConfig(json2PojoModel);
        Annotator annotator = new AnnotatorFactory(config).getAnnotator(AnnotationStyle.valueOf(json2PojoModel.getAnnotationstyle().toUpperCase(Locale.ROOT)));
        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, annotator, new SchemaStore()), new SchemaGenerator());
        mapper.generate(codeModel, json2PojoModel.getClassname(), json2PojoModel.getTargetpackage(), json2PojoModel.getSchema());
        File file = Files.createTempDirectory(Paths.get(tempDir), "Json2Pojo").toFile();
        codeModel.build(file);
        return file;
    }

    private GenerationConfig getGenerationConfig(Json2PojoModel json2PojoModel) {
        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() { // set config option by overriding method
                return Boolean.parseBoolean(json2PojoModel.getGeneratebuilders());
            }

            @Override
            public boolean isUsePrimitives() {
                return Boolean.parseBoolean(json2PojoModel.getUseprimitives());
            }

            @Override
            public boolean isUseLongIntegers() {
                return Boolean.parseBoolean(json2PojoModel.getUselongintegers());
            }

            @Override
            public boolean isUseDoubleNumbers() {
                return Boolean.parseBoolean(json2PojoModel.getUsedoublenumbers());
            }

            @Override
            public boolean isUseJodaDates() {
                return Boolean.parseBoolean(json2PojoModel.getUsejodadates());
            }

            @Override
            public boolean isIncludeGetters() {
                return Boolean.parseBoolean(json2PojoModel.getIncludeaccessors());
            }

            @Override
            public boolean isIncludeSetters() {
                return Boolean.parseBoolean(json2PojoModel.getIncludeaccessors());
            }

            @Override
            public boolean isIncludeConstructors() {
                return Boolean.parseBoolean(json2PojoModel.getIncludeconstructors());
            }

            @Override
            public boolean isIncludeHashcodeAndEquals() {
                return Boolean.parseBoolean(json2PojoModel.getIncludehashcodeandequals());
            }

            @Override
            public boolean isIncludeToString() {
                return Boolean.parseBoolean(json2PojoModel.getIncludetostring());
            }

            @Override
            public boolean isIncludeJsr303Annotations() {
                return Boolean.parseBoolean(json2PojoModel.getIncludejsr303annotations());
            }

            @Override
            public boolean isIncludeAdditionalProperties() {
                return Boolean.parseBoolean(json2PojoModel.getIncludeadditionalproperties());
            }

            @Override
            public boolean isSerializable() {
                return Boolean.parseBoolean(json2PojoModel.getSerializable());
            }

            @Override
            public boolean isParcelable() {
                return Boolean.parseBoolean(json2PojoModel.getParcelable());
            }

            @Override
            public boolean isInitializeCollections() {
                return Boolean.parseBoolean(json2PojoModel.getInitializecollections());
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.valueOf(json2PojoModel.getSourcetype().toUpperCase(Locale.ROOT));
            }

            @Override
            public char[] getPropertyWordDelimiters() {
                if(json2PojoModel.getPropertyworddelimiters()==null){
                    return super.getPropertyWordDelimiters();
                }
                return json2PojoModel.getPropertyworddelimiters().toCharArray();
            }
        };
        return config;
    }

    public static void main(String[] args) {
        System.out.println(SourceType.valueOf("JSON"));
    }

    public static void getWebsiteFile(File file, StringBuilder stringBuilder) throws IOException {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null) return;
            for (File perFile : files) {
                getWebsiteFile(perFile, stringBuilder);
            }
        } else {
            String classFullName = file.getCanonicalPath().replace("/", ".") + file.getName();
            int splitLength = (90 - classFullName.length()) / 2;
            for (int i = 0; i < splitLength; i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append(classFullName);
            for (int i = 0; i < splitLength; i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append("\r\n");
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                String line;
                while (true) {
                    line = bufferedReader.readLine();
                    if (line != null) {
                        stringBuilder.append(line).append("\r\n");
                    } else {
                        break;
                    }
                }
            } finally {
                IOCloseUtil.close(bufferedReader);
            }

        }
    }
}
