package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class YN0 {

    @NotNull
    public static final Set<Integer> a;

    static {
        Integer[] elements = {1, 3, 10};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
    }

    @Nullable
    public static final Boolean a(@NotNull CommonResult<C6106qG> ourUser) {
        Intrinsics.checkNotNullParameter(ourUser, "ourUser");
        if (ourUser instanceof ResultOk) {
            return Boolean.valueOf(((C6106qG) ((ResultOk) ourUser).a()).d);
        }
        if (!(ourUser instanceof ResultError)) {
            throw new C6489s51();
        }
        CommonError error = ((ResultError) ourUser).getError();
        Regex regex = C1603Nh1.a;
        Intrinsics.checkNotNullParameter(error, "<this>");
        if ((error instanceof CommonError.UserNotInDatabase) || (error instanceof CommonError.UserNotInPlatformDatabase)) {
            return Boolean.FALSE;
        }
        return null;
    }
}
