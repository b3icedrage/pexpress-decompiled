package com.jivosite.sdk.model.repository.rating;

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

/* JADX INFO: renamed from: com.jivosite.sdk.model.repository.rating.RatingJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/repository/rating/RatingJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/repository/rating/Rating;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<Rating> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    @Nullable
    public volatile Constructor<Rating> c;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("rate", "comment");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"rate\", \"comment\")");
        this.a = aVarA;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, C6702t60.d, "rate");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…emptySet(),\n      \"rate\")");
        this.b = abstractC5897pG0C;
    }

    @Override // defpackage.AbstractC5897pG0
    public final Rating a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        String strA = null;
        String strA2 = null;
        int i = -1;
        while (reader.hasNext()) {
            int iQ = reader.q(this.a);
            if (iQ == -1) {
                reader.u();
                reader.I();
            } else if (iQ == 0) {
                strA = this.b.a(reader);
                if (strA == null) {
                    EG0 eg0L = C6596sc2.l("rate", "rate", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"rate\", \"rate\", reader)");
                    throw eg0L;
                }
                i &= -2;
            } else if (iQ == 1) {
                strA2 = this.b.a(reader);
                if (strA2 == null) {
                    EG0 eg0L2 = C6596sc2.l("comment", "comment", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"comment\"…       \"comment\", reader)");
                    throw eg0L2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        reader.B0();
        if (i == -4) {
            Intrinsics.c(strA, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.c(strA2, "null cannot be cast to non-null type kotlin.String");
            return new Rating(strA, strA2);
        }
        Constructor<Rating> declaredConstructor = this.c;
        if (declaredConstructor == null) {
            declaredConstructor = Rating.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, C6596sc2.c);
            this.c = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "Rating::class.java.getDe…his.constructorRef = it }");
        }
        Rating ratingNewInstance = declaredConstructor.newInstance(strA, strA2, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(ratingNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return ratingNewInstance;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, Rating rating) {
        Rating rating2 = rating;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (rating2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("rate");
        AbstractC5897pG0<String> abstractC5897pG0 = this.b;
        abstractC5897pG0.e(writer, rating2.a);
        writer.q("comment");
        abstractC5897pG0.e(writer, rating2.b);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(Rating)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
