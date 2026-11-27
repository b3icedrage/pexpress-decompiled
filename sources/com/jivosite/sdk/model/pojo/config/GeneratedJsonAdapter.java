package com.jivosite.sdk.model.pojo.config;

import com.jivosite.sdk.model.pojo.rate.RateSettings;
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

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.config.ConfigJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/config/ConfigJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/config/Config;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<Config> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    @NotNull
    public final AbstractC5897pG0<Boolean> c;

    @NotNull
    public final AbstractC5897pG0<Integer> d;

    @NotNull
    public final AbstractC5897pG0<RateSettings> e;

    @Nullable
    public volatile Constructor<Config> f;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("site_id", "chatserver_host", "api_host", "files_host", "license", "show_rate_form", "rate_settings");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"site_id\", \"chatserve…e_form\", \"rate_settings\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, c6702t60, "siteId");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…ptySet(),\n      \"siteId\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<Boolean> abstractC5897pG0C2 = moshi.c(Boolean.class, c6702t60, "license");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(Boolean::c…e, emptySet(), \"license\")");
        this.c = abstractC5897pG0C2;
        AbstractC5897pG0<Integer> abstractC5897pG0C3 = moshi.c(Integer.class, c6702t60, "showRateForm");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C3, "moshi.adapter(Int::class…ptySet(), \"showRateForm\")");
        this.d = abstractC5897pG0C3;
        AbstractC5897pG0<RateSettings> abstractC5897pG0C4 = moshi.c(RateSettings.class, c6702t60, "rateSettings");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C4, "moshi.adapter(RateSettin…ptySet(), \"rateSettings\")");
        this.e = abstractC5897pG0C4;
    }

    @Override // defpackage.AbstractC5897pG0
    public final Config a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        int i = -1;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        Boolean boolA = null;
        Integer numA = null;
        RateSettings rateSettingsA = null;
        while (true) {
            String str = strA;
            String str2 = strA2;
            if (!reader.hasNext()) {
                String str3 = strA3;
                reader.B0();
                String str4 = strA4;
                if (i == -113) {
                    if (str == null) {
                        EG0 eg0F = C6596sc2.f("siteId", "site_id", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"siteId\", \"site_id\", reader)");
                        throw eg0F;
                    }
                    if (str2 == null) {
                        EG0 eg0F2 = C6596sc2.f("chatserverHost", "chatserver_host", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"chatser…chatserver_host\", reader)");
                        throw eg0F2;
                    }
                    if (str3 == null) {
                        EG0 eg0F3 = C6596sc2.f("apiHost", "api_host", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F3, "missingProperty(\"apiHost\", \"api_host\", reader)");
                        throw eg0F3;
                    }
                    if (str4 != null) {
                        return new Config(str, str2, str3, str4, boolA, numA, rateSettingsA);
                    }
                    EG0 eg0F4 = C6596sc2.f("filesHost", "files_host", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F4, "missingProperty(\"filesHost\", \"files_host\", reader)");
                    throw eg0F4;
                }
                int i2 = i;
                Boolean bool = boolA;
                Integer num = numA;
                Constructor<Config> declaredConstructor = this.f;
                if (declaredConstructor == null) {
                    declaredConstructor = Config.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Boolean.class, Integer.class, RateSettings.class, Integer.TYPE, C6596sc2.c);
                    this.f = declaredConstructor;
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "Config::class.java.getDe…his.constructorRef = it }");
                }
                if (str == null) {
                    EG0 eg0F5 = C6596sc2.f("siteId", "site_id", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F5, "missingProperty(\"siteId\", \"site_id\", reader)");
                    throw eg0F5;
                }
                if (str2 == null) {
                    EG0 eg0F6 = C6596sc2.f("chatserverHost", "chatserver_host", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F6, "missingProperty(\"chatser…chatserver_host\", reader)");
                    throw eg0F6;
                }
                if (str3 == null) {
                    EG0 eg0F7 = C6596sc2.f("apiHost", "api_host", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F7, "missingProperty(\"apiHost\", \"api_host\", reader)");
                    throw eg0F7;
                }
                if (str4 == null) {
                    EG0 eg0F8 = C6596sc2.f("filesHost", "files_host", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F8, "missingProperty(\"filesHost\", \"files_host\", reader)");
                    throw eg0F8;
                }
                Config configNewInstance = declaredConstructor.newInstance(str, str2, str3, str4, bool, num, rateSettingsA, Integer.valueOf(i2), null);
                Intrinsics.checkNotNullExpressionValue(configNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return configNewInstance;
            }
            String str5 = strA3;
            switch (reader.q(this.a)) {
                case -1:
                    reader.u();
                    reader.I();
                    strA3 = str5;
                    strA = str;
                    strA2 = str2;
                    break;
                case 0:
                    strA = this.b.a(reader);
                    if (strA == null) {
                        EG0 eg0L = C6596sc2.l("siteId", "site_id", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"siteId\",…       \"site_id\", reader)");
                        throw eg0L;
                    }
                    strA3 = str5;
                    strA2 = str2;
                    break;
                    break;
                case 1:
                    strA2 = this.b.a(reader);
                    if (strA2 == null) {
                        EG0 eg0L2 = C6596sc2.l("chatserverHost", "chatserver_host", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"chatserv…chatserver_host\", reader)");
                        throw eg0L2;
                    }
                    strA3 = str5;
                    strA = str;
                    break;
                    break;
                case 2:
                    strA3 = this.b.a(reader);
                    if (strA3 == null) {
                        EG0 eg0L3 = C6596sc2.l("apiHost", "api_host", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L3, "unexpectedNull(\"apiHost\"…      \"api_host\", reader)");
                        throw eg0L3;
                    }
                    strA = str;
                    strA2 = str2;
                    break;
                case 3:
                    strA4 = this.b.a(reader);
                    if (strA4 == null) {
                        EG0 eg0L4 = C6596sc2.l("filesHost", "files_host", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L4, "unexpectedNull(\"filesHos…    \"files_host\", reader)");
                        throw eg0L4;
                    }
                    strA3 = str5;
                    strA = str;
                    strA2 = str2;
                    break;
                case 4:
                    boolA = this.c.a(reader);
                    i &= -17;
                    strA3 = str5;
                    strA = str;
                    strA2 = str2;
                    break;
                case 5:
                    numA = this.d.a(reader);
                    i &= -33;
                    strA3 = str5;
                    strA = str;
                    strA2 = str2;
                    break;
                case 6:
                    rateSettingsA = this.e.a(reader);
                    i &= -65;
                    strA3 = str5;
                    strA = str;
                    strA2 = str2;
                    break;
                default:
                    strA3 = str5;
                    strA = str;
                    strA2 = str2;
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, Config config) {
        Config config2 = config;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (config2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("site_id");
        AbstractC5897pG0<String> abstractC5897pG0 = this.b;
        abstractC5897pG0.e(writer, config2.c);
        writer.q("chatserver_host");
        abstractC5897pG0.e(writer, config2.d);
        writer.q("api_host");
        abstractC5897pG0.e(writer, config2.e);
        writer.q("files_host");
        abstractC5897pG0.e(writer, config2.f);
        writer.q("license");
        this.c.e(writer, config2.g);
        writer.q("show_rate_form");
        this.d.e(writer, config2.h);
        writer.q("rate_settings");
        this.e.e(writer, config2.i);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(Config)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
