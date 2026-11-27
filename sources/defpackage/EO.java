package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EO implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ EO(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7810yO((InterfaceC1442Lg1) this.b.get());
            case 1:
                return new C5102lW0((InterfaceC1442Lg1) this.b.get());
            case 2:
                return new C0638Ay1((Context) this.b.get());
            case 3:
                AbstractC5463nB1 router = (AbstractC5463nB1) this.b.get();
                Intrinsics.checkNotNullParameter(router, "router");
                return new C5112lZ1(router);
            default:
                Context context = (Context) this.b.get();
                Intrinsics.checkNotNullParameter(context, "context");
                String string = context.getString(R.string.onboarding_slide_1_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{context.getString(R.string.platform_name)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                G52 g52 = new G52(0, R.raw.onboarding_1, str, true, false);
                String string2 = context.getString(R.string.onboarding_slide_2_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                G52 g53 = new G52(1, R.raw.onboarding_2, string2, true, true);
                String string3 = context.getString(R.string.onboarding_slide_3_title);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                G52 g54 = new G52(2, R.raw.onboarding_3, string3, false, true);
                String string4 = context.getString(R.string.onboarding_slide_4_title);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return new B52(WE.f(g52, g53, g54, new G52(3, R.raw.onboarding_4, string4, true, true)));
        }
    }

    public EO(LL ll, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = 4;
        this.b = interfaceC1531Mk1;
    }
}
