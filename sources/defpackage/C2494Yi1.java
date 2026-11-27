package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2494Yi1 implements InterfaceC2152Ui1 {

    @NotNull
    public final InterfaceC1442Lg1 a;

    @NotNull
    public final InterfaceC2152Ui1.b b;

    @NotNull
    public final InterfaceC2152Ui1.c c;

    @NotNull
    public final InterfaceC2152Ui1.a d;

    @NotNull
    public final C6610sg0 e;

    @NotNull
    public final InterfaceC6396rf0<Long> f;

    @NotNull
    public final InterfaceC6396rf0<Long> g;

    /* JADX INFO: renamed from: Yi1$a */
    @InterfaceC3368dU(c = "com.base.feature.trading.usecases.ProfitLimitUseCaseBase$isEnabled$1", f = "ProfitLimitUseCaseBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            boolean z = this.d;
            boolean z2 = true;
            if (this.e && !z) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Boolean bool, Boolean bool2, JM<? super Boolean> jm) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = new a(3, jm);
            aVar.d = zBooleanValue;
            aVar.e = zBooleanValue2;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public C2494Yi1(@NotNull InterfaceC1442Lg1 preferencesRepository, @NotNull InterfaceC2152Ui1.b isEnabledKeyApi, @NotNull InterfaceC2152Ui1.c realValueKeyApi, @NotNull InterfaceC2152Ui1.a demoValueKeyApi, @NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(isEnabledKeyApi, "isEnabledKeyApi");
        Intrinsics.checkNotNullParameter(realValueKeyApi, "realValueKeyApi");
        Intrinsics.checkNotNullParameter(demoValueKeyApi, "demoValueKeyApi");
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = preferencesRepository;
        this.b = isEnabledKeyApi;
        this.c = realValueKeyApi;
        this.d = demoValueKeyApi;
        this.e = new C6610sg0(preferencesRepository.d(isEnabledKeyApi, Boolean.FALSE), appData.e, new a(3, null));
        this.f = preferencesRepository.a(realValueKeyApi);
        this.g = preferencesRepository.a(demoValueKeyApi);
    }

    @Override // defpackage.InterfaceC2152Ui1
    @NotNull
    public final InterfaceC6396rf0<Long> a() {
        return this.g;
    }

    @Override // defpackage.InterfaceC2152Ui1
    @NotNull
    public final InterfaceC6396rf0<Long> b() {
        return this.f;
    }

    @Override // defpackage.InterfaceC2152Ui1
    @Nullable
    public final Object c(@NotNull C5710oO c5710oO, @NotNull C3475dz1 c3475dz1) {
        return this.a.b(this.d, new C2572Zi1(1, c5710oO, Intrinsics.a.class, "suspendConversion0", "writeDemoValue$suspendConversion0$1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), c3475dz1);
    }

    @Override // defpackage.InterfaceC2152Ui1
    @Nullable
    public final Object d(@NotNull C5710oO c5710oO, @NotNull C3475dz1 c3475dz1) {
        return this.a.b(this.c, new C3005bj1(1, c5710oO, Intrinsics.a.class, "suspendConversion0", "writeRealValue$suspendConversion0$0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), c3475dz1);
    }

    @Override // defpackage.InterfaceC2152Ui1
    @Nullable
    public final Object e(@NotNull C2542Yy1 c2542Yy1, @NotNull C3056bz1 c3056bz1) {
        return this.a.b(this.b, new C2781aj1(1, c2542Yy1, Intrinsics.a.class, "suspendConversion0", "writeIsEnabled$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), c3056bz1);
    }

    @Override // defpackage.InterfaceC2152Ui1
    @NotNull
    public final C6610sg0 isEnabled() {
        return this.e;
    }
}
