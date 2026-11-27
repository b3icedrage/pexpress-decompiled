package com.jivosite.sdk.model.pojo.response;

import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.C3903g11;
import defpackage.C6596sc2;
import defpackage.C6702t60;
import defpackage.C6918u72;
import defpackage.EG0;
import defpackage.YH0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.response.ResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/response/ResponseJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/response/Response;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<Response> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<Boolean> b;

    @NotNull
    public final AbstractC5897pG0<List<String>> c;

    @Nullable
    public volatile Constructor<Response> d;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("ok", "error_list");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"ok\", \"error_list\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<Boolean> abstractC5897pG0C = moshi.c(Boolean.TYPE, c6702t60, "isOk");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(Boolean::c…emptySet(),\n      \"isOk\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<List<String>> abstractC5897pG0C2 = moshi.c(C6918u72.d(List.class, String.class), c6702t60, "errorList");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(Types.newP…Set(),\n      \"errorList\")");
        this.c = abstractC5897pG0C2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final Response a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean boolA = Boolean.FALSE;
        reader.X0();
        List<String> listA = null;
        int i = -1;
        while (reader.hasNext()) {
            int iQ = reader.q(this.a);
            if (iQ == -1) {
                reader.u();
                reader.I();
            } else if (iQ == 0) {
                boolA = this.b.a(reader);
                if (boolA == null) {
                    EG0 eg0L = C6596sc2.l("isOk", "ok", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"isOk\", \"ok\", reader)");
                    throw eg0L;
                }
                i &= -2;
            } else if (iQ == 1) {
                listA = this.c.a(reader);
                i &= -3;
            }
        }
        reader.B0();
        if (i == -4) {
            return new Response(boolA.booleanValue(), listA);
        }
        Constructor<Response> declaredConstructor = this.d;
        if (declaredConstructor == null) {
            declaredConstructor = Response.class.getDeclaredConstructor(Boolean.TYPE, List.class, Integer.TYPE, C6596sc2.c);
            this.d = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "Response::class.java.get…his.constructorRef = it }");
        }
        Response responseNewInstance = declaredConstructor.newInstance(boolA, listA, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(responseNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return responseNewInstance;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, Response response) {
        Response response2 = response;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (response2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("ok");
        this.b.e(writer, Boolean.valueOf(response2.getG()));
        writer.q("error_list");
        this.c.e(writer, response2.a());
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(Response)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
