package defpackage;

import android.content.Context;
import android.text.SpannableString;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7692xo0 implements InterfaceC8112zo0 {

    @NotNull
    public final InterfaceC5167ln1 a;

    @NotNull
    public final Context b;

    public C7692xo0(@NotNull InterfaceC5167ln1 resourceProvider, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = resourceProvider;
        this.b = context;
    }

    @Override // defpackage.InterfaceC8112zo0
    @NotNull
    public final SpannableString a(@NotNull Function0<Unit> onPlatformTermsAndConditionsClick, @NotNull Function0<Unit> onPlatformPrivacyPolicyClick, @NotNull Function0<Unit> onPlatformTermsAndConditionsClick2, @NotNull Function0<Unit> onPlatformPrivacyPolicyClick2, @NotNull Function0<Unit> onPublicOfferClick) {
        Intrinsics.checkNotNullParameter(onPlatformTermsAndConditionsClick, "onPlatformTermsAndConditionsClick");
        Intrinsics.checkNotNullParameter(onPlatformPrivacyPolicyClick, "onPlatformPrivacyPolicyClick");
        Intrinsics.checkNotNullParameter(onPlatformTermsAndConditionsClick2, "onRobotTermsAndConditionsClick");
        Intrinsics.checkNotNullParameter(onPlatformPrivacyPolicyClick2, "onRobotPrivacyPolicyClick");
        Intrinsics.checkNotNullParameter(onPublicOfferClick, "onPublicOfferClick");
        InterfaceC5167ln1 interfaceC5167ln1 = this.a;
        String str = String.format(interfaceC5167ln1.c(), interfaceC5167ln1.e(), interfaceC5167ln1.a(), interfaceC5167ln1.b());
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(onPlatformTermsAndConditionsClick2, "onPlatformTermsAndConditionsClick");
        Intrinsics.checkNotNullParameter(onPlatformPrivacyPolicyClick2, "onPlatformPrivacyPolicyClick");
        return C5109lY1.a(str, WE.f(new C0685Bo0(interfaceC5167ln1.a(), R.color.primary, new X(onPlatformTermsAndConditionsClick2), 8), new C0685Bo0(interfaceC5167ln1.b(), R.color.primary, new C2561Zf(onPlatformPrivacyPolicyClick2), 8)), this.b);
    }

    @Override // defpackage.InterfaceC8112zo0
    @NotNull
    public final SpannableString b(@NotNull String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        InterfaceC5167ln1 interfaceC5167ln1 = this.a;
        String str = String.format(titleText, interfaceC5167ln1.d());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return C5109lY1.a(str, VE.c(new C0685Bo0(interfaceC5167ln1.d(), R.color.primary, null, 24)), this.b);
    }
}
