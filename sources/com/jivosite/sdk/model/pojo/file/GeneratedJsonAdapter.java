package com.jivosite.sdk.model.pojo.file;

import com.google.android.gms.common.internal.ImagesContract;
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

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.file.AccessResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/file/AccessResponseJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/file/AccessResponse;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<AccessResponse> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<Boolean> b;

    @NotNull
    public final AbstractC5897pG0<String> c;

    @Nullable
    public volatile Constructor<AccessResponse> d;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("ok", ImagesContract.URL, "date", "policy", "credential", "algorithm", "signature", "key");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"ok\", \"url\", \"date\", …thm\", \"signature\", \"key\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<Boolean> abstractC5897pG0C = moshi.c(Boolean.TYPE, c6702t60, "isOk");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(Boolean::c…emptySet(),\n      \"isOk\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<String> abstractC5897pG0C2 = moshi.c(String.class, c6702t60, ImagesContract.URL);
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(String::cl… emptySet(),\n      \"url\")");
        this.c = abstractC5897pG0C2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final AccessResponse a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.X0();
        int i = -1;
        Boolean boolA = bool;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        String strA5 = null;
        String strA6 = null;
        String strA7 = null;
        while (true) {
            Boolean bool2 = boolA;
            String str = strA;
            if (!reader.hasNext()) {
                String str2 = strA2;
                reader.B0();
                String str3 = strA3;
                String str4 = strA4;
                String str5 = strA5;
                String str6 = strA6;
                String str7 = strA7;
                if (i == -2) {
                    boolean zBooleanValue = bool2.booleanValue();
                    if (str == null) {
                        EG0 eg0F = C6596sc2.f(ImagesContract.URL, ImagesContract.URL, reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"url\", \"url\", reader)");
                        throw eg0F;
                    }
                    if (str2 == null) {
                        EG0 eg0F2 = C6596sc2.f("date", "date", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"date\", \"date\", reader)");
                        throw eg0F2;
                    }
                    if (str3 == null) {
                        EG0 eg0F3 = C6596sc2.f("policy", "policy", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F3, "missingProperty(\"policy\", \"policy\", reader)");
                        throw eg0F3;
                    }
                    if (str4 == null) {
                        EG0 eg0F4 = C6596sc2.f("credential", "credential", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F4, "missingProperty(\"credent…l\", \"credential\", reader)");
                        throw eg0F4;
                    }
                    if (str5 == null) {
                        EG0 eg0F5 = C6596sc2.f("algorithm", "algorithm", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F5, "missingProperty(\"algorithm\", \"algorithm\", reader)");
                        throw eg0F5;
                    }
                    if (str6 == null) {
                        EG0 eg0F6 = C6596sc2.f("signature", "signature", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0F6, "missingProperty(\"signature\", \"signature\", reader)");
                        throw eg0F6;
                    }
                    if (str7 != null) {
                        return new AccessResponse(zBooleanValue, str, str2, str3, str4, str5, str6, str7);
                    }
                    EG0 eg0F7 = C6596sc2.f("key", "key", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F7, "missingProperty(\"key\", \"key\", reader)");
                    throw eg0F7;
                }
                int i2 = i;
                Constructor<AccessResponse> declaredConstructor = this.d;
                if (declaredConstructor == null) {
                    declaredConstructor = AccessResponse.class.getDeclaredConstructor(Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, C6596sc2.c);
                    this.d = declaredConstructor;
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "AccessResponse::class.ja…his.constructorRef = it }");
                }
                if (str == null) {
                    EG0 eg0F8 = C6596sc2.f(ImagesContract.URL, ImagesContract.URL, reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F8, "missingProperty(\"url\", \"url\", reader)");
                    throw eg0F8;
                }
                if (str2 == null) {
                    EG0 eg0F9 = C6596sc2.f("date", "date", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F9, "missingProperty(\"date\", \"date\", reader)");
                    throw eg0F9;
                }
                if (str3 == null) {
                    EG0 eg0F10 = C6596sc2.f("policy", "policy", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F10, "missingProperty(\"policy\", \"policy\", reader)");
                    throw eg0F10;
                }
                if (str4 == null) {
                    EG0 eg0F11 = C6596sc2.f("credential", "credential", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F11, "missingProperty(\"credent…l\", \"credential\", reader)");
                    throw eg0F11;
                }
                if (str5 == null) {
                    EG0 eg0F12 = C6596sc2.f("algorithm", "algorithm", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F12, "missingProperty(\"algorithm\", \"algorithm\", reader)");
                    throw eg0F12;
                }
                if (str6 == null) {
                    EG0 eg0F13 = C6596sc2.f("signature", "signature", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0F13, "missingProperty(\"signature\", \"signature\", reader)");
                    throw eg0F13;
                }
                if (str7 != null) {
                    AccessResponse accessResponseNewInstance = declaredConstructor.newInstance(bool2, str, str2, str3, str4, str5, str6, str7, Integer.valueOf(i2), null);
                    Intrinsics.checkNotNullExpressionValue(accessResponseNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return accessResponseNewInstance;
                }
                EG0 eg0F14 = C6596sc2.f("key", "key", reader);
                Intrinsics.checkNotNullExpressionValue(eg0F14, "missingProperty(\"key\", \"key\", reader)");
                throw eg0F14;
            }
            String str8 = strA2;
            switch (reader.q(this.a)) {
                case -1:
                    reader.u();
                    reader.I();
                    strA2 = str8;
                    boolA = bool2;
                    strA = str;
                    break;
                case 0:
                    boolA = this.b.a(reader);
                    if (boolA == null) {
                        EG0 eg0L = C6596sc2.l("isOk", "ok", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"isOk\", \"ok\", reader)");
                        throw eg0L;
                    }
                    strA2 = str8;
                    strA = str;
                    i = -2;
                    break;
                    break;
                case 1:
                    strA = this.c.a(reader);
                    if (strA == null) {
                        EG0 eg0L2 = C6596sc2.l(ImagesContract.URL, ImagesContract.URL, reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"url\", \"url\", reader)");
                        throw eg0L2;
                    }
                    strA2 = str8;
                    boolA = bool2;
                    break;
                    break;
                case 2:
                    strA2 = this.c.a(reader);
                    if (strA2 == null) {
                        EG0 eg0L3 = C6596sc2.l("date", "date", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L3, "unexpectedNull(\"date\", \"date\",\n            reader)");
                        throw eg0L3;
                    }
                    boolA = bool2;
                    strA = str;
                    break;
                case 3:
                    strA3 = this.c.a(reader);
                    if (strA3 == null) {
                        EG0 eg0L4 = C6596sc2.l("policy", "policy", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L4, "unexpectedNull(\"policy\",…        \"policy\", reader)");
                        throw eg0L4;
                    }
                    strA2 = str8;
                    boolA = bool2;
                    strA = str;
                    break;
                case 4:
                    strA4 = this.c.a(reader);
                    if (strA4 == null) {
                        EG0 eg0L5 = C6596sc2.l("credential", "credential", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L5, "unexpectedNull(\"credenti…    \"credential\", reader)");
                        throw eg0L5;
                    }
                    strA2 = str8;
                    boolA = bool2;
                    strA = str;
                    break;
                case 5:
                    strA5 = this.c.a(reader);
                    if (strA5 == null) {
                        EG0 eg0L6 = C6596sc2.l("algorithm", "algorithm", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L6, "unexpectedNull(\"algorith…     \"algorithm\", reader)");
                        throw eg0L6;
                    }
                    strA2 = str8;
                    boolA = bool2;
                    strA = str;
                    break;
                case 6:
                    strA6 = this.c.a(reader);
                    if (strA6 == null) {
                        EG0 eg0L7 = C6596sc2.l("signature", "signature", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L7, "unexpectedNull(\"signatur…     \"signature\", reader)");
                        throw eg0L7;
                    }
                    strA2 = str8;
                    boolA = bool2;
                    strA = str;
                    break;
                case 7:
                    strA7 = this.c.a(reader);
                    if (strA7 == null) {
                        EG0 eg0L8 = C6596sc2.l("key", "key", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L8, "unexpectedNull(\"key\", \"key\", reader)");
                        throw eg0L8;
                    }
                    strA2 = str8;
                    boolA = bool2;
                    strA = str;
                    break;
                default:
                    strA2 = str8;
                    boolA = bool2;
                    strA = str;
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, AccessResponse accessResponse) {
        AccessResponse accessResponse2 = accessResponse;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (accessResponse2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("ok");
        this.b.e(writer, Boolean.valueOf(accessResponse2.c));
        writer.q(ImagesContract.URL);
        AbstractC5897pG0<String> abstractC5897pG0 = this.c;
        abstractC5897pG0.e(writer, accessResponse2.d);
        writer.q("date");
        abstractC5897pG0.e(writer, accessResponse2.e);
        writer.q("policy");
        abstractC5897pG0.e(writer, accessResponse2.f);
        writer.q("credential");
        abstractC5897pG0.e(writer, accessResponse2.g);
        writer.q("algorithm");
        abstractC5897pG0.e(writer, accessResponse2.h);
        writer.q("signature");
        abstractC5897pG0.e(writer, accessResponse2.i);
        writer.q("key");
        abstractC5897pG0.e(writer, accessResponse2.j);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(AccessResponse)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
