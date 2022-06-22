package com.ximouzhao.json2pojo_on_line.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "schema",
        "targetpackage",
        "classname",
        "sourcetype",
        "annotationstyle",
        "generatebuilders",
        "useprimitives",
        "uselongintegers",
        "usedoublenumbers",
        "usejodadates",
        "includeaccessors",
        "includeconstructors",
        "includehashcodeandequals",
        "includetostring",
        "includejsr303annotations",
        "includeadditionalproperties",
        "serializable",
        "parcelable",
        "initializecollections",
        "propertyworddelimiters"
})
@Generated("jsonschema2pojo")
public class Json2PojoModel {

    @JsonProperty("schema")
    @JSONField(name = "schema")
    private String schema;
    @JsonProperty("targetpackage")
    @JSONField(name = "targetpackage")
    private String targetpackage;
    @JsonProperty("classname")
    @JSONField(name = "classname")
    private String classname;
    @JsonProperty("sourcetype")
    @JSONField(name = "sourcetype")
    private String sourcetype;
    @JsonProperty("annotationstyle")
    @JSONField(name = "annotationstyle")
    private String annotationstyle;
    @JsonProperty("generatebuilders")
    @JSONField(name = "generatebuilders")
    private String generatebuilders;
    @JsonProperty("useprimitives")
    @JSONField(name = "useprimitives")
    private String useprimitives;
    @JsonProperty("uselongintegers")
    @JSONField(name = "uselongintegers")
    private String uselongintegers;
    @JsonProperty("usedoublenumbers")
    @JSONField(name = "usedoublenumbers")
    private String usedoublenumbers;
    @JsonProperty("usejodadates")
    @JSONField(name = "usejodadates")
    private String usejodadates;
    @JsonProperty("includeaccessors")
    @JSONField(name = "includeaccessors")
    private String includeaccessors;
    @JsonProperty("includeconstructors")
    @JSONField(name = "includeconstructors")
    private String includeconstructors;
    @JsonProperty("includehashcodeandequals")
    @JSONField(name = "includehashcodeandequals")
    private String includehashcodeandequals;
    @JsonProperty("includetostring")
    @JSONField(name = "includetostring")
    private String includetostring;
    @JsonProperty("includejsr303annotations")
    @JSONField(name = "includejsr303annotations")
    private String includejsr303annotations;
    @JsonProperty("includeadditionalproperties")
    @JSONField(name = "includeadditionalproperties")
    private String includeadditionalproperties;
    @JsonProperty("serializable")
    @JSONField(name = "serializable")
    private String serializable;
    @JsonProperty("parcelable")
    @JSONField(name = "parcelable")
    private String parcelable;
    @JsonProperty("initializecollections")
    @JSONField(name = "initializecollections")
    private String initializecollections;
    @JsonProperty("propertyworddelimiters")
    @JSONField(name = "propertyworddelimiters")
    private String propertyworddelimiters;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("schema")
    @JSONField(name = "schema")
    public String getSchema() {
        return schema;
    }

    @JsonProperty("schema")
    @JSONField(name = "schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Json2PojoModel withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    @JsonProperty("targetpackage")
    @JSONField(name = "targetpackage")
    public String getTargetpackage() {
        return targetpackage;
    }

    @JsonProperty("targetpackage")
    @JSONField(name = "targetpackage")
    public void setTargetpackage(String targetpackage) {
        this.targetpackage = targetpackage;
    }

    public Json2PojoModel withTargetpackage(String targetpackage) {
        this.targetpackage = targetpackage;
        return this;
    }

    @JsonProperty("classname")
    @JSONField(name = "classname")
    public String getClassname() {
        return classname;
    }

    @JsonProperty("classname")
    @JSONField(name = "classname")
    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Json2PojoModel withClassname(String classname) {
        this.classname = classname;
        return this;
    }

    @JsonProperty("sourcetype")
    @JSONField(name = "sourcetype")
    public String getSourcetype() {
        return sourcetype;
    }

    @JsonProperty("sourcetype")
    @JSONField(name = "sourcetype")
    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype;
    }

    public Json2PojoModel withSourcetype(String sourcetype) {
        this.sourcetype = sourcetype;
        return this;
    }

    @JsonProperty("annotationstyle")
    @JSONField(name = "annotationstyle")
    public String getAnnotationstyle() {
        return annotationstyle;
    }

    @JsonProperty("annotationstyle")
    @JSONField(name = "annotationstyle")
    public void setAnnotationstyle(String annotationstyle) {
        this.annotationstyle = annotationstyle;
    }

    public Json2PojoModel withAnnotationstyle(String annotationstyle) {
        this.annotationstyle = annotationstyle;
        return this;
    }

    @JsonProperty("generatebuilders")
    @JSONField(name = "generatebuilders")
    public String getGeneratebuilders() {
        return generatebuilders;
    }

    @JsonProperty("generatebuilders")
    @JSONField(name = "generatebuilders")
    public void setGeneratebuilders(String generatebuilders) {
        this.generatebuilders = generatebuilders;
    }

    public Json2PojoModel withGeneratebuilders(String generatebuilders) {
        this.generatebuilders = generatebuilders;
        return this;
    }

    @JsonProperty("useprimitives")
    @JSONField(name = "useprimitives")
    public String getUseprimitives() {
        return useprimitives;
    }

    @JsonProperty("useprimitives")
    @JSONField(name = "useprimitives")
    public void setUseprimitives(String useprimitives) {
        this.useprimitives = useprimitives;
    }

    public Json2PojoModel withUseprimitives(String useprimitives) {
        this.useprimitives = useprimitives;
        return this;
    }

    @JsonProperty("uselongintegers")
    @JSONField(name = "uselongintegers")
    public String getUselongintegers() {
        return uselongintegers;
    }

    @JsonProperty("uselongintegers")
    @JSONField(name = "uselongintegers")
    public void setUselongintegers(String uselongintegers) {
        this.uselongintegers = uselongintegers;
    }

    public Json2PojoModel withUselongintegers(String uselongintegers) {
        this.uselongintegers = uselongintegers;
        return this;
    }

    @JsonProperty("usedoublenumbers")
    @JSONField(name = "usedoublenumbers")
    public String getUsedoublenumbers() {
        return usedoublenumbers;
    }

    @JsonProperty("usedoublenumbers")
    @JSONField(name = "usedoublenumbers")
    public void setUsedoublenumbers(String usedoublenumbers) {
        this.usedoublenumbers = usedoublenumbers;
    }

    public Json2PojoModel withUsedoublenumbers(String usedoublenumbers) {
        this.usedoublenumbers = usedoublenumbers;
        return this;
    }

    @JsonProperty("usejodadates")
    @JSONField(name = "usejodadates")
    public String getUsejodadates() {
        return usejodadates;
    }

    @JsonProperty("usejodadates")
    @JSONField(name = "usejodadates")
    public void setUsejodadates(String usejodadates) {
        this.usejodadates = usejodadates;
    }

    public Json2PojoModel withUsejodadates(String usejodadates) {
        this.usejodadates = usejodadates;
        return this;
    }

    @JsonProperty("includeaccessors")
    @JSONField(name = "includeaccessors")
    public String getIncludeaccessors() {
        return includeaccessors;
    }

    @JsonProperty("includeaccessors")
    @JSONField(name = "includeaccessors")
    public void setIncludeaccessors(String includeaccessors) {
        this.includeaccessors = includeaccessors;
    }

    public Json2PojoModel withIncludeaccessors(String includeaccessors) {
        this.includeaccessors = includeaccessors;
        return this;
    }

    @JsonProperty("includeconstructors")
    @JSONField(name = "includeconstructors")
    public String getIncludeconstructors() {
        return includeconstructors;
    }

    @JsonProperty("includeconstructors")
    @JSONField(name = "includeconstructors")
    public void setIncludeconstructors(String includeconstructors) {
        this.includeconstructors = includeconstructors;
    }

    public Json2PojoModel withIncludeconstructors(String includeconstructors) {
        this.includeconstructors = includeconstructors;
        return this;
    }

    @JsonProperty("includehashcodeandequals")
    @JSONField(name = "includehashcodeandequals")
    public String getIncludehashcodeandequals() {
        return includehashcodeandequals;
    }

    @JsonProperty("includehashcodeandequals")
    @JSONField(name = "includehashcodeandequals")
    public void setIncludehashcodeandequals(String includehashcodeandequals) {
        this.includehashcodeandequals = includehashcodeandequals;
    }

    public Json2PojoModel withIncludehashcodeandequals(String includehashcodeandequals) {
        this.includehashcodeandequals = includehashcodeandequals;
        return this;
    }

    @JsonProperty("includetostring")
    @JSONField(name = "includetostring")
    public String getIncludetostring() {
        return includetostring;
    }

    @JsonProperty("includetostring")
    @JSONField(name = "includetostring")
    public void setIncludetostring(String includetostring) {
        this.includetostring = includetostring;
    }

    public Json2PojoModel withIncludetostring(String includetostring) {
        this.includetostring = includetostring;
        return this;
    }

    @JsonProperty("includejsr303annotations")
    @JSONField(name = "includejsr303annotations")
    public String getIncludejsr303annotations() {
        return includejsr303annotations;
    }

    @JsonProperty("includejsr303annotations")
    @JSONField(name = "includejsr303annotations")
    public void setIncludejsr303annotations(String includejsr303annotations) {
        this.includejsr303annotations = includejsr303annotations;
    }

    public Json2PojoModel withIncludejsr303annotations(String includejsr303annotations) {
        this.includejsr303annotations = includejsr303annotations;
        return this;
    }

    @JsonProperty("includeadditionalproperties")
    @JSONField(name = "includeadditionalproperties")
    public String getIncludeadditionalproperties() {
        return includeadditionalproperties;
    }

    @JsonProperty("includeadditionalproperties")
    @JSONField(name = "includeadditionalproperties")
    public void setIncludeadditionalproperties(String includeadditionalproperties) {
        this.includeadditionalproperties = includeadditionalproperties;
    }

    public Json2PojoModel withIncludeadditionalproperties(String includeadditionalproperties) {
        this.includeadditionalproperties = includeadditionalproperties;
        return this;
    }

    @JsonProperty("serializable")
    @JSONField(name = "serializable")
    public String getSerializable() {
        return serializable;
    }

    @JsonProperty("serializable")
    @JSONField(name = "serializable")
    public void setSerializable(String serializable) {
        this.serializable = serializable;
    }

    public Json2PojoModel withSerializable(String serializable) {
        this.serializable = serializable;
        return this;
    }

    @JsonProperty("parcelable")
    @JSONField(name = "parcelable")
    public String getParcelable() {
        return parcelable;
    }

    @JsonProperty("parcelable")
    @JSONField(name = "parcelable")
    public void setParcelable(String parcelable) {
        this.parcelable = parcelable;
    }

    public Json2PojoModel withParcelable(String parcelable) {
        this.parcelable = parcelable;
        return this;
    }

    @JsonProperty("initializecollections")
    @JSONField(name = "initializecollections")
    public String getInitializecollections() {
        return initializecollections;
    }

    @JsonProperty("initializecollections")
    @JSONField(name = "initializecollections")
    public void setInitializecollections(String initializecollections) {
        this.initializecollections = initializecollections;
    }

    public Json2PojoModel withInitializecollections(String initializecollections) {
        this.initializecollections = initializecollections;
        return this;
    }

    @JsonProperty("propertyworddelimiters")
    @JSONField(name = "propertyworddelimiters")
    public String getPropertyworddelimiters() {
        return propertyworddelimiters;
    }

    @JsonProperty("propertyworddelimiters")
    @JSONField(name = "propertyworddelimiters")
    public void setPropertyworddelimiters(String propertyworddelimiters) {
        this.propertyworddelimiters = propertyworddelimiters;
    }

    public Json2PojoModel withPropertyworddelimiters(String propertyworddelimiters) {
        this.propertyworddelimiters = propertyworddelimiters;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Json2PojoModel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Json2PojoModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schema");
        sb.append('=');
        sb.append(((this.schema == null) ? "<null>" : this.schema));
        sb.append(',');
        sb.append("targetpackage");
        sb.append('=');
        sb.append(((this.targetpackage == null) ? "<null>" : this.targetpackage));
        sb.append(',');
        sb.append("classname");
        sb.append('=');
        sb.append(((this.classname == null) ? "<null>" : this.classname));
        sb.append(',');
        sb.append("sourcetype");
        sb.append('=');
        sb.append(((this.sourcetype == null) ? "<null>" : this.sourcetype));
        sb.append(',');
        sb.append("annotationstyle");
        sb.append('=');
        sb.append(((this.annotationstyle == null) ? "<null>" : this.annotationstyle));
        sb.append(',');
        sb.append("generatebuilders");
        sb.append('=');
        sb.append(((this.generatebuilders == null) ? "<null>" : this.generatebuilders));
        sb.append(',');
        sb.append("useprimitives");
        sb.append('=');
        sb.append(((this.useprimitives == null) ? "<null>" : this.useprimitives));
        sb.append(',');
        sb.append("uselongintegers");
        sb.append('=');
        sb.append(((this.uselongintegers == null) ? "<null>" : this.uselongintegers));
        sb.append(',');
        sb.append("usedoublenumbers");
        sb.append('=');
        sb.append(((this.usedoublenumbers == null) ? "<null>" : this.usedoublenumbers));
        sb.append(',');
        sb.append("usejodadates");
        sb.append('=');
        sb.append(((this.usejodadates == null) ? "<null>" : this.usejodadates));
        sb.append(',');
        sb.append("includeaccessors");
        sb.append('=');
        sb.append(((this.includeaccessors == null) ? "<null>" : this.includeaccessors));
        sb.append(',');
        sb.append("includeconstructors");
        sb.append('=');
        sb.append(((this.includeconstructors == null) ? "<null>" : this.includeconstructors));
        sb.append(',');
        sb.append("includehashcodeandequals");
        sb.append('=');
        sb.append(((this.includehashcodeandequals == null) ? "<null>" : this.includehashcodeandequals));
        sb.append(',');
        sb.append("includetostring");
        sb.append('=');
        sb.append(((this.includetostring == null) ? "<null>" : this.includetostring));
        sb.append(',');
        sb.append("includejsr303annotations");
        sb.append('=');
        sb.append(((this.includejsr303annotations == null) ? "<null>" : this.includejsr303annotations));
        sb.append(',');
        sb.append("includeadditionalproperties");
        sb.append('=');
        sb.append(((this.includeadditionalproperties == null) ? "<null>" : this.includeadditionalproperties));
        sb.append(',');
        sb.append("serializable");
        sb.append('=');
        sb.append(((this.serializable == null) ? "<null>" : this.serializable));
        sb.append(',');
        sb.append("parcelable");
        sb.append('=');
        sb.append(((this.parcelable == null) ? "<null>" : this.parcelable));
        sb.append(',');
        sb.append("initializecollections");
        sb.append('=');
        sb.append(((this.initializecollections == null) ? "<null>" : this.initializecollections));
        sb.append(',');
        sb.append("propertyworddelimiters");
        sb.append('=');
        sb.append(((this.propertyworddelimiters == null) ? "<null>" : this.propertyworddelimiters));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.schema == null) ? 0 : this.schema.hashCode()));
        result = ((result * 31) + ((this.propertyworddelimiters == null) ? 0 : this.propertyworddelimiters.hashCode()));
        result = ((result * 31) + ((this.initializecollections == null) ? 0 : this.initializecollections.hashCode()));
        result = ((result * 31) + ((this.includejsr303annotations == null) ? 0 : this.includejsr303annotations.hashCode()));
        result = ((result * 31) + ((this.includeadditionalproperties == null) ? 0 : this.includeadditionalproperties.hashCode()));
        result = ((result * 31) + ((this.annotationstyle == null) ? 0 : this.annotationstyle.hashCode()));
        result = ((result * 31) + ((this.serializable == null) ? 0 : this.serializable.hashCode()));
        result = ((result * 31) + ((this.generatebuilders == null) ? 0 : this.generatebuilders.hashCode()));
        result = ((result * 31) + ((this.includeconstructors == null) ? 0 : this.includeconstructors.hashCode()));
        result = ((result * 31) + ((this.includeaccessors == null) ? 0 : this.includeaccessors.hashCode()));
        result = ((result * 31) + ((this.includehashcodeandequals == null) ? 0 : this.includehashcodeandequals.hashCode()));
        result = ((result * 31) + ((this.classname == null) ? 0 : this.classname.hashCode()));
        result = ((result * 31) + ((this.parcelable == null) ? 0 : this.parcelable.hashCode()));
        result = ((result * 31) + ((this.targetpackage == null) ? 0 : this.targetpackage.hashCode()));
        result = ((result * 31) + ((this.sourcetype == null) ? 0 : this.sourcetype.hashCode()));
        result = ((result * 31) + ((this.useprimitives == null) ? 0 : this.useprimitives.hashCode()));
        result = ((result * 31) + ((this.includetostring == null) ? 0 : this.includetostring.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.usedoublenumbers == null) ? 0 : this.usedoublenumbers.hashCode()));
        result = ((result * 31) + ((this.uselongintegers == null) ? 0 : this.uselongintegers.hashCode()));
        result = ((result * 31) + ((this.usejodadates == null) ? 0 : this.usejodadates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Json2PojoModel) == false) {
            return false;
        }
        Json2PojoModel rhs = ((Json2PojoModel) other);
        return ((((((((((((((((((((((this.schema == rhs.schema) || ((this.schema != null) && this.schema.equals(rhs.schema))) && ((this.propertyworddelimiters == rhs.propertyworddelimiters) || ((this.propertyworddelimiters != null) && this.propertyworddelimiters.equals(rhs.propertyworddelimiters)))) && ((this.initializecollections == rhs.initializecollections) || ((this.initializecollections != null) && this.initializecollections.equals(rhs.initializecollections)))) && ((this.includejsr303annotations == rhs.includejsr303annotations) || ((this.includejsr303annotations != null) && this.includejsr303annotations.equals(rhs.includejsr303annotations)))) && ((this.includeadditionalproperties == rhs.includeadditionalproperties) || ((this.includeadditionalproperties != null) && this.includeadditionalproperties.equals(rhs.includeadditionalproperties)))) && ((this.annotationstyle == rhs.annotationstyle) || ((this.annotationstyle != null) && this.annotationstyle.equals(rhs.annotationstyle)))) && ((this.serializable == rhs.serializable) || ((this.serializable != null) && this.serializable.equals(rhs.serializable)))) && ((this.generatebuilders == rhs.generatebuilders) || ((this.generatebuilders != null) && this.generatebuilders.equals(rhs.generatebuilders)))) && ((this.includeconstructors == rhs.includeconstructors) || ((this.includeconstructors != null) && this.includeconstructors.equals(rhs.includeconstructors)))) && ((this.includeaccessors == rhs.includeaccessors) || ((this.includeaccessors != null) && this.includeaccessors.equals(rhs.includeaccessors)))) && ((this.includehashcodeandequals == rhs.includehashcodeandequals) || ((this.includehashcodeandequals != null) && this.includehashcodeandequals.equals(rhs.includehashcodeandequals)))) && ((this.classname == rhs.classname) || ((this.classname != null) && this.classname.equals(rhs.classname)))) && ((this.parcelable == rhs.parcelable) || ((this.parcelable != null) && this.parcelable.equals(rhs.parcelable)))) && ((this.targetpackage == rhs.targetpackage) || ((this.targetpackage != null) && this.targetpackage.equals(rhs.targetpackage)))) && ((this.sourcetype == rhs.sourcetype) || ((this.sourcetype != null) && this.sourcetype.equals(rhs.sourcetype)))) && ((this.useprimitives == rhs.useprimitives) || ((this.useprimitives != null) && this.useprimitives.equals(rhs.useprimitives)))) && ((this.includetostring == rhs.includetostring) || ((this.includetostring != null) && this.includetostring.equals(rhs.includetostring)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.usedoublenumbers == rhs.usedoublenumbers) || ((this.usedoublenumbers != null) && this.usedoublenumbers.equals(rhs.usedoublenumbers)))) && ((this.uselongintegers == rhs.uselongintegers) || ((this.uselongintegers != null) && this.uselongintegers.equals(rhs.uselongintegers)))) && ((this.usejodadates == rhs.usejodadates) || ((this.usejodadates != null) && this.usejodadates.equals(rhs.usejodadates))));
    }

}