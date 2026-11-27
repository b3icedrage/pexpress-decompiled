package com.jivosite.sdk.model.pojo.media;

import com.google.android.gms.common.internal.ImagesContract;
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

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.media.MediaSignResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/media/MediaSignResponseJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/media/MediaSignResponse;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<MediaSignResponse> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    @NotNull
    public final AbstractC5897pG0<Long> c;

    @NotNull
    public final AbstractC5897pG0<Boolean> d;

    @NotNull
    public final AbstractC5897pG0<List<String>> e;

    @Nullable
    public volatile Constructor<MediaSignResponse> f;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("sign", "ts", ImagesContract.URL, "metadata", "ok", "error_list");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"sign\", \"ts\", \"url\", …      \"ok\", \"error_list\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, c6702t60, "sign");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…      emptySet(), \"sign\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<Long> abstractC5897pG0C2 = moshi.c(Long.class, c6702t60, "ts");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(Long::clas…,\n      emptySet(), \"ts\")");
        this.c = abstractC5897pG0C2;
        AbstractC5897pG0<Boolean> abstractC5897pG0C3 = moshi.c(Boolean.TYPE, c6702t60, "isOk");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C3, "moshi.adapter(Boolean::c…emptySet(),\n      \"isOk\")");
        this.d = abstractC5897pG0C3;
        AbstractC5897pG0<List<String>> abstractC5897pG0C4 = moshi.c(C6918u72.d(List.class, String.class), c6702t60, "errorList");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C4, "moshi.adapter(Types.newP…Set(),\n      \"errorList\")");
        this.e = abstractC5897pG0C4;
    }

    @Override // defpackage.AbstractC5897pG0
    public final MediaSignResponse a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.X0();
        Long lA = null;
        Boolean boolA = bool;
        String strA = null;
        String strA2 = null;
        List<String> listA = null;
        int i = -1;
        String strA3 = null;
        while (reader.hasNext()) {
            switch (reader.q(this.a)) {
                case -1:
                    reader.u();
                    reader.I();
                    break;
                case 0:
                    strA = this.b.a(reader);
                    i &= -2;
                    break;
                case 1:
                    lA = this.c.a(reader);
                    i &= -3;
                    break;
                case 2:
                    strA3 = this.b.a(reader);
                    i &= -5;
                    break;
                case 3:
                    strA2 = this.b.a(reader);
                    i &= -9;
                    break;
                case 4:
                    boolA = this.d.a(reader);
                    if (boolA == null) {
                        EG0 eg0L = C6596sc2.l("isOk", "ok", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"isOk\", \"ok\", reader)");
                        throw eg0L;
                    }
                    i &= -17;
                    break;
                    break;
                case 5:
                    listA = this.e.a(reader);
                    i &= -33;
                    break;
            }
        }
        reader.B0();
        if (i == -64) {
            return new MediaSignResponse(strA, lA, strA3, strA2, boolA.booleanValue(), listA);
        }
        Constructor<MediaSignResponse> declaredConstructor = this.f;
        if (declaredConstructor == null) {
            declaredConstructor = MediaSignResponse.class.getDeclaredConstructor(String.class, Long.class, String.class, String.class, Boolean.TYPE, List.class, Integer.TYPE, C6596sc2.c);
            this.f = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "MediaSignResponse::class…his.constructorRef = it }");
        }
        String str = strA;
        MediaSignResponse mediaSignResponseNewInstance = declaredConstructor.newInstance(str, lA, strA3, strA2, boolA, listA, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(mediaSignResponseNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return mediaSignResponseNewInstance;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, MediaSignResponse mediaSignResponse) {
        MediaSignResponse mediaSignResponse2 = mediaSignResponse;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (mediaSignResponse2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("sign");
        AbstractC5897pG0<String> abstractC5897pG0 = this.b;
        abstractC5897pG0.e(writer, mediaSignResponse2.c);
        writer.q("ts");
        this.c.e(writer, mediaSignResponse2.d);
        writer.q(ImagesContract.URL);
        abstractC5897pG0.e(writer, mediaSignResponse2.e);
        writer.q("metadata");
        abstractC5897pG0.e(writer, mediaSignResponse2.f);
        writer.q("ok");
        this.d.e(writer, Boolean.valueOf(mediaSignResponse2.g));
        writer.q("error_list");
        this.e.e(writer, mediaSignResponse2.h);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(MediaSignResponse)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
