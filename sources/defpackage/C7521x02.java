package defpackage;

import com.pexpress.tool.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: x02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7521x02 implements InterfaceC6890u02 {

    @NotNull
    public final InterfaceC5862p6 a;

    @NotNull
    public final List<C6680t02> b;

    @NotNull
    public final List<C6680t02> c;

    @NotNull
    public final List<C5508nQ1> d;

    @NotNull
    public final List<C5508nQ1> e;

    public C7521x02(@NotNull InterfaceC5862p6 activationStateProviderApi) {
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        this.a = activationStateProviderApi;
        C6680t02.a aVar = C6680t02.a.d;
        C6680t02 c6680t02 = new C6680t02(aVar, false, R.string.stepper_1_title, R.drawable.ic_account_activation_step_successful_circle, null, false, R.color.white);
        C6680t02.a aVar2 = C6680t02.a.e;
        Integer numValueOf = Integer.valueOf(R.color.surface);
        C6680t02 c6680t03 = new C6680t02(aVar2, true, R.string.unavailable_trading_step1_done, R.drawable.ic_green_circle, numValueOf, true, R.color.white);
        C6680t02.a aVar3 = C6680t02.a.g;
        this.b = WE.f(c6680t02, c6680t03, new C6680t02(aVar3, true, R.string.unavailable_trading_step2, R.drawable.ic_green_circle, numValueOf, false, R.color.textGrey));
        this.c = WE.f(new C6680t02(aVar, false, R.string.stepper_1_title, R.drawable.ic_account_activation_step_successful_circle, null, false, R.color.white), new C6680t02(aVar, false, R.string.unavailable_trading_step1_done, R.drawable.ic_account_activation_step_successful_circle, null, false, R.color.white), new C6680t02(aVar3, true, R.string.unavailable_trading_step2, R.drawable.ic_green_circle, numValueOf, true, R.color.white));
        this.d = WE.f(new C5508nQ1(R.color.primary), new C5508nQ1(R.color.surface));
        this.e = WE.f(new C5508nQ1(R.color.primary), new C5508nQ1(R.color.primary));
    }

    @Override // defpackage.InterfaceC6890u02
    @NotNull
    public final C7310w02 a() {
        return new C7310w02(this.a.a(), this);
    }

    @Override // defpackage.InterfaceC6890u02
    @NotNull
    public final C7100v02 b() {
        return new C7100v02(this.a.a(), this);
    }
}
