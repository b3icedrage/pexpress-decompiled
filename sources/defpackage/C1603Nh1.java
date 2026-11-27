package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1603Nh1 {

    @NotNull
    public static final Regex a = new Regex("^http_401(:|$)");

    public static final boolean a(@NotNull CommonError commonError) {
        Intrinsics.checkNotNullParameter(commonError, "<this>");
        return (commonError instanceof CommonError.NotAuthenticated) || (commonError instanceof CommonError.TokenError) || (commonError instanceof CommonError.UserNotInPlatformDatabase) || a.a(commonError.getPlatformCode());
    }
}
