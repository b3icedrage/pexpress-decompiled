package com.jivosite.sdk.model.pojo.rate;

import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.C3903g11;
import defpackage.C6596sc2;
import defpackage.C6702t60;
import defpackage.EG0;
import defpackage.YH0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.rate.RateSettingsJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/rate/RateSettingsJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/rate/RateSettings;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<RateSettings> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<RateSettings.b> b;

    @NotNull
    public final AbstractC5897pG0<RateSettings.a> c;

    @NotNull
    public final AbstractC5897pG0<String> d;

    @NotNull
    public final AbstractC5897pG0<Integer> e;

    @NotNull
    public final AbstractC5897pG0<String> f;

    @Nullable
    public volatile Constructor<RateSettings> g;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("type", "icon", "condition_name", "condition_value", "custom_title", "good_rate_title", "bad_rate_title");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"type\", \"icon\", \"cond…title\", \"bad_rate_title\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<RateSettings.b> abstractC5897pG0C = moshi.c(RateSettings.b.class, c6702t60, "type");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(RateSettin…java, emptySet(), \"type\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<RateSettings.a> abstractC5897pG0C2 = moshi.c(RateSettings.a.class, c6702t60, "icon");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(RateSettin…java, emptySet(), \"icon\")");
        this.c = abstractC5897pG0C2;
        AbstractC5897pG0<String> abstractC5897pG0C3 = moshi.c(String.class, c6702t60, "conditionName");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C3, "moshi.adapter(String::cl…),\n      \"conditionName\")");
        this.d = abstractC5897pG0C3;
        AbstractC5897pG0<Integer> abstractC5897pG0C4 = moshi.c(Integer.TYPE, c6702t60, "conditionValue");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C4, "moshi.adapter(Int::class…,\n      \"conditionValue\")");
        this.e = abstractC5897pG0C4;
        AbstractC5897pG0<String> abstractC5897pG0C5 = moshi.c(String.class, c6702t60, "customTitle");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C5, "moshi.adapter(String::cl…mptySet(), \"customTitle\")");
        this.f = abstractC5897pG0C5;
    }

    @Override // defpackage.AbstractC5897pG0
    public final RateSettings a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        int i = -1;
        RateSettings.b bVarA = null;
        RateSettings.a aVarA = null;
        String strA = null;
        Integer numA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        while (reader.hasNext()) {
            RateSettings.b bVar = bVarA;
            switch (reader.q(this.a)) {
                case -1:
                    reader.u();
                    reader.I();
                    break;
                case 0:
                    bVarA = this.b.a(reader);
                    if (bVarA == null) {
                        EG0 eg0L = C6596sc2.l("type", "type", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"type\", \"type\",\n            reader)");
                        throw eg0L;
                    }
                    continue;
                    break;
                case 1:
                    aVarA = this.c.a(reader);
                    if (aVarA == null) {
                        EG0 eg0L2 = C6596sc2.l("icon", "icon", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"icon\", \"icon\",\n            reader)");
                        throw eg0L2;
                    }
                    break;
                case 2:
                    strA = this.d.a(reader);
                    if (strA == null) {
                        EG0 eg0L3 = C6596sc2.l("conditionName", "condition_name", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L3, "unexpectedNull(\"conditio…\"condition_name\", reader)");
                        throw eg0L3;
                    }
                    break;
                case 3:
                    numA = this.e.a(reader);
                    if (numA == null) {
                        EG0 eg0L4 = C6596sc2.l("conditionValue", "condition_value", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L4, "unexpectedNull(\"conditio…condition_value\", reader)");
                        throw eg0L4;
                    }
                    break;
                case 4:
                    strA2 = this.f.a(reader);
                    i &= -17;
                    break;
                case 5:
                    strA3 = this.f.a(reader);
                    i &= -33;
                    break;
                case 6:
                    strA4 = this.f.a(reader);
                    i &= -65;
                    break;
            }
            bVarA = bVar;
        }
        RateSettings.b bVar2 = bVarA;
        reader.B0();
        RateSettings.a aVar = aVarA;
        String str = strA;
        Integer num = numA;
        String str2 = strA2;
        if (i == -113) {
            if (bVar2 == null) {
                EG0 eg0F = C6596sc2.f("type", "type", reader);
                Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"type\", \"type\", reader)");
                throw eg0F;
            }
            if (aVar == null) {
                EG0 eg0F2 = C6596sc2.f("icon", "icon", reader);
                Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"icon\", \"icon\", reader)");
                throw eg0F2;
            }
            if (str == null) {
                EG0 eg0F3 = C6596sc2.f("conditionName", "condition_name", reader);
                Intrinsics.checkNotNullExpressionValue(eg0F3, "missingProperty(\"conditi…\"condition_name\", reader)");
                throw eg0F3;
            }
            if (num != null) {
                return new RateSettings(bVar2, aVar, str, num.intValue(), str2, strA3, strA4);
            }
            EG0 eg0F4 = C6596sc2.f("conditionValue", "condition_value", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F4, "missingProperty(\"conditi…condition_value\", reader)");
            throw eg0F4;
        }
        Constructor<RateSettings> declaredConstructor = this.g;
        if (declaredConstructor == null) {
            Class<?> cls = C6596sc2.c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = RateSettings.class.getDeclaredConstructor(RateSettings.b.class, RateSettings.a.class, String.class, cls2, String.class, String.class, String.class, cls2, cls);
            this.g = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "RateSettings::class.java…his.constructorRef = it }");
        }
        Constructor<RateSettings> constructor = declaredConstructor;
        if (bVar2 == null) {
            EG0 eg0F5 = C6596sc2.f("type", "type", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F5, "missingProperty(\"type\", \"type\", reader)");
            throw eg0F5;
        }
        if (aVar == null) {
            EG0 eg0F6 = C6596sc2.f("icon", "icon", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F6, "missingProperty(\"icon\", \"icon\", reader)");
            throw eg0F6;
        }
        if (str == null) {
            EG0 eg0F7 = C6596sc2.f("conditionName", "condition_name", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F7, "missingProperty(\"conditi…\"condition_name\", reader)");
            throw eg0F7;
        }
        if (num != null) {
            RateSettings rateSettingsNewInstance = constructor.newInstance(bVar2, aVar, str, num, str2, strA3, strA4, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(rateSettingsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return rateSettingsNewInstance;
        }
        EG0 eg0F8 = C6596sc2.f("conditionValue", "condition_value", reader);
        Intrinsics.checkNotNullExpressionValue(eg0F8, "missingProperty(\"conditi…condition_value\", reader)");
        throw eg0F8;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, RateSettings rateSettings) {
        RateSettings rateSettings2 = rateSettings;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (rateSettings2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("type");
        this.b.e(writer, rateSettings2.a);
        writer.q("icon");
        this.c.e(writer, rateSettings2.b);
        writer.q("condition_name");
        this.d.e(writer, rateSettings2.c);
        writer.q("condition_value");
        this.e.e(writer, Integer.valueOf(rateSettings2.d));
        writer.q("custom_title");
        AbstractC5897pG0<String> abstractC5897pG0 = this.f;
        abstractC5897pG0.e(writer, rateSettings2.e);
        writer.q("good_rate_title");
        abstractC5897pG0.e(writer, rateSettings2.f);
        writer.q("bad_rate_title");
        abstractC5897pG0.e(writer, rateSettings2.g);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(RateSettings)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
