package defpackage;

import android.content.Context;
import android.text.SpannableString;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ao0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0607Ao0 implements InterfaceC8112zo0 {

    @NotNull
    public final InterfaceC6843tm a;

    @NotNull
    public final Context b;

    public C0607Ao0(@NotNull InterfaceC6843tm resourceProvider, @NotNull Context context) {
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
        InterfaceC6843tm interfaceC6843tm = this.a;
        String str = String.format(interfaceC6843tm.c(), interfaceC6843tm.e(), interfaceC6843tm.a(), interfaceC6843tm.b());
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(onPlatformTermsAndConditionsClick2, "onPlatformTermsAndConditionsClick");
        Intrinsics.checkNotNullParameter(onPlatformPrivacyPolicyClick2, "onPlatformPrivacyPolicyClick");
        return C5109lY1.a(str, WE.f(new C0685Bo0(interfaceC6843tm.a(), R.color.primary, new F4(onPlatformTermsAndConditionsClick2), 8), new C0685Bo0(interfaceC6843tm.b(), R.color.primary, new C3623eh(onPlatformPrivacyPolicyClick2), 8)), this.b);
    }

    @Override // defpackage.InterfaceC8112zo0
    @NotNull
    public final SpannableString b(@NotNull String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        InterfaceC6843tm interfaceC6843tm = this.a;
        String str = String.format(titleText, interfaceC6843tm.d());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return C5109lY1.a(str, VE.c(new C0685Bo0(interfaceC6843tm.d(), R.color.primary, null, 24)), this.b);
    }
}
