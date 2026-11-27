package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.PlatformErrorApi;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6305rC1 implements InterfaceC4833kC1 {

    @NotNull
    public static final List<String> b = WE.f("message", ProductAction.ACTION_DETAIL, "error", "error_description", "title");

    @NotNull
    public static final Regex c;

    @NotNull
    public static final Regex d;

    @NotNull
    public final Set<PlatformErrorApi> a;

    static {
        EnumC4537iq1[] elements = {EnumC4537iq1.IGNORE_CASE, EnumC4537iq1.DOT_MATCHES_ALL};
        Intrinsics.checkNotNullParameter(elements, "elements");
        c = new Regex(C1526Mj.H(elements));
        d = new Regex("\\s+");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6305rC1(@NotNull Set<? extends PlatformErrorApi> platformErrors) {
        Intrinsics.checkNotNullParameter(platformErrors, "platformErrors");
        this.a = platformErrors;
        XO0.b(new C5886pC1(0));
        XO0.b(new C6096qC1());
    }

    public static String b(JsonObject jsonObject, String str) {
        String strF;
        JsonElement jsonElementH = jsonObject.h(str);
        JsonPrimitive jsonPrimitive = jsonElementH instanceof JsonPrimitive ? (JsonPrimitive) jsonElementH : null;
        if (jsonPrimitive == null || (strF = jsonPrimitive.f()) == null || StringsKt.I(strF)) {
            return null;
        }
        return strF;
    }

    @NotNull
    public final ResultError a(@NotNull String platformCode, @NotNull String errorText) {
        Object next;
        Intrinsics.checkNotNullParameter(platformCode, "platformCode");
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        CommonError.Companion companion = CommonError.INSTANCE;
        Intrinsics.checkNotNullParameter(platformCode, "platformCode");
        Iterator<T> it = this.a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((PlatformErrorApi) next).getCode(), platformCode));
        PlatformErrorApi platformErrorApi = (PlatformErrorApi) next;
        CommonError commonErrorForPlatformError = platformErrorApi != null ? platformErrorApi.getCommonErrorForPlatformError() : null;
        int code = commonErrorForPlatformError != null ? commonErrorForPlatformError.getCode() : CommonError.Codes.UnexpectedError.getValue();
        companion.getClass();
        return new ResultError(CommonError.Companion.a(code, errorText, platformCode));
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError l(@NotNull CommonError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ResultError(error);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError m(@NotNull String errorText) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        return new ResultError(CommonError.Companion.b(CommonError.INSTANCE, CommonError.Codes.UnexpectedError.getValue(), errorText, null, 4));
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T extends HttpResponse<?>> Object o(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return InterfaceC4833kC1.a.b(jm, this, new C5043lC1(null, this, function1));
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object t(@NotNull Function1<? super JM<? super CommonResult<? extends T>>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return InterfaceC4833kC1.a.b(jm, this, function1);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object w(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return InterfaceC4833kC1.a.c(jm, this, function1);
    }
}
