package defpackage;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7649xd0<T> extends EP1<T> {

    @NotNull
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7649xd0(@NotNull Throwable finalException) {
        super(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.b = finalException;
    }
}
