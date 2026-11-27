package com.jivosite.sdk.model.repository.rating;

import defpackage.C1039Gc0;
import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jivosite/sdk/model/repository/rating/Rating;", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Rating {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public Rating() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rating)) {
            return false;
        }
        Rating rating = (Rating) obj;
        return Intrinsics.a(this.a, rating.a) && Intrinsics.a(this.b, rating.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating(rate=");
        sb.append(this.a);
        sb.append(", comment=");
        return C1039Gc0.e(sb, this.b, ')');
    }

    public Rating(@NotNull String rate, @NotNull String comment) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.a = rate;
        this.b = comment;
    }

    public /* synthetic */ Rating(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
