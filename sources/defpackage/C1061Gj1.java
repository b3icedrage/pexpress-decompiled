package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Gj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"LGj1;", "", "<init>", "()V", "LkJ1;", "operation", "Lsj1;", "propertiesObject", "createPropertiesFromOperation", "(LkJ1;Lsj1;)Lsj1;", "LlX;", "(LlX;Lsj1;)Lsj1;", "LiJ1;", "(LiJ1;Lsj1;)Lsj1;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1061Gj1 {

    @NotNull
    public static final C1061Gj1 INSTANCE = new C1061Gj1();

    private C1061Gj1() {
    }

    @NotNull
    public final C6623sj1 createPropertiesFromOperation(@NotNull C4854kJ1 operation, @NotNull C6623sj1 propertiesObject) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap linkedHashMapL = tags != null ? PW0.l(tags) : null;
        if (linkedHashMapL == null) {
            linkedHashMapL = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = linkedHashMapL;
        linkedHashMap.put(operation.getKey(), operation.getValue());
        return new C6623sj1(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    @NotNull
    public final C6623sj1 createPropertiesFromOperation(@NotNull C5104lX operation, @NotNull C6623sj1 propertiesObject) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        Map<String, String> tags = propertiesObject.getTags();
        LinkedHashMap linkedHashMapL = tags != null ? PW0.l(tags) : null;
        if (linkedHashMapL == null) {
            linkedHashMapL = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = linkedHashMapL;
        linkedHashMap.put(operation.getKey(), null);
        return new C6623sj1(linkedHashMap, propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final C6623sj1 createPropertiesFromOperation(@NotNull C4386iJ1 operation, @NotNull C6623sj1 propertiesObject) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(propertiesObject, "propertiesObject");
        String property = operation.getProperty();
        Object objValueOf = null;
        if (Intrinsics.a(property, "language")) {
            Map<String, String> tags = propertiesObject.getTags();
            Object value = operation.getValue();
            return new C6623sj1(tags, value != null ? value.toString() : null, propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
        }
        if (Intrinsics.a(property, "timezone")) {
            Map<String, String> tags2 = propertiesObject.getTags();
            String language = propertiesObject.getLanguage();
            Object value2 = operation.getValue();
            return new C6623sj1(tags2, language, value2 != null ? value2.toString() : null, propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
        }
        if (Intrinsics.a(property, "country")) {
            Map<String, String> tags3 = propertiesObject.getTags();
            String language2 = propertiesObject.getLanguage();
            String timezoneId = propertiesObject.getTimezoneId();
            Object value3 = operation.getValue();
            return new C6623sj1(tags3, language2, timezoneId, value3 != null ? value3.toString() : null, propertiesObject.getLatitude(), propertiesObject.getLongitude());
        }
        if (Intrinsics.a(property, "locationLatitude")) {
            Map<String, String> tags4 = propertiesObject.getTags();
            String language3 = propertiesObject.getLanguage();
            String timezoneId2 = propertiesObject.getTimezoneId();
            String country = propertiesObject.getCountry();
            Object value4 = operation.getValue();
            if (value4 != null && (string2 = value4.toString()) != null) {
                objValueOf = Double.valueOf(Double.parseDouble(string2));
            }
            return new C6623sj1(tags4, language3, timezoneId2, country, objValueOf, propertiesObject.getLongitude());
        }
        if (Intrinsics.a(property, "locationLongitude")) {
            Map<String, String> tags5 = propertiesObject.getTags();
            String language4 = propertiesObject.getLanguage();
            String timezoneId3 = propertiesObject.getTimezoneId();
            String country2 = propertiesObject.getCountry();
            Double latitude = propertiesObject.getLatitude();
            Object value5 = operation.getValue();
            if (value5 != null && (string = value5.toString()) != null) {
                objValueOf = Double.valueOf(Double.parseDouble(string));
            }
            return new C6623sj1(tags5, language4, timezoneId3, country2, latitude, objValueOf);
        }
        return new C6623sj1(propertiesObject.getTags(), propertiesObject.getLanguage(), propertiesObject.getTimezoneId(), propertiesObject.getCountry(), propertiesObject.getLatitude(), propertiesObject.getLongitude());
    }
}
