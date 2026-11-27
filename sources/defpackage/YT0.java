package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class YT0 implements RT0 {

    @NotNull
    public final InterfaceC1442Lg1 a;

    @NotNull
    public final RT0.b b;

    @NotNull
    public final RT0.c c;

    @NotNull
    public final RT0.a d;

    @NotNull
    public final InterfaceC6396rf0<Boolean> e;

    @NotNull
    public final InterfaceC6396rf0<Long> f;

    @NotNull
    public final InterfaceC6396rf0<Long> g;

    public YT0(@NotNull InterfaceC1442Lg1 preferencesRepository, @NotNull RT0.b isEnabledKeyApi, @NotNull RT0.c realValueKey, @NotNull RT0.a demoValueKey) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(isEnabledKeyApi, "isEnabledKeyApi");
        Intrinsics.checkNotNullParameter(realValueKey, "realValueKey");
        Intrinsics.checkNotNullParameter(demoValueKey, "demoValueKey");
        this.a = preferencesRepository;
        this.b = isEnabledKeyApi;
        this.c = realValueKey;
        this.d = demoValueKey;
        this.e = preferencesRepository.d(isEnabledKeyApi, Boolean.TRUE);
        this.f = preferencesRepository.a(realValueKey);
        this.g = preferencesRepository.a(demoValueKey);
    }

    @Override // defpackage.RT0
    @NotNull
    public final InterfaceC6396rf0<Long> a() {
        return this.g;
    }

    @Override // defpackage.RT0
    @NotNull
    public final InterfaceC6396rf0<Long> b() {
        return this.f;
    }

    @Override // defpackage.RT0
    @Nullable
    public final Object c(@NotNull C7530x3 c7530x3, @NotNull C7921yu1 c7921yu1) {
        return this.a.b(this.c, new XT0(1, c7530x3, Intrinsics.a.class, "suspendConversion0", "writeRealValue$suspendConversion0$0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), c7921yu1);
    }

    @Override // defpackage.RT0
    @Nullable
    public final Object d(@NotNull Function0 function0, @NotNull AW1 aw1) {
        return this.a.b(this.b, new WT0(1, function0, Intrinsics.a.class, "suspendConversion0", "writeIsEnabled$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), aw1);
    }

    @Override // defpackage.RT0
    @Nullable
    public final Object e(@NotNull X5 x5, @NotNull C7921yu1 c7921yu1) {
        return this.a.b(this.d, new VT0(1, x5, Intrinsics.a.class, "suspendConversion0", "writeDemoValue$suspendConversion0$1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), c7921yu1);
    }

    @Override // defpackage.RT0
    @NotNull
    public final InterfaceC6396rf0<Boolean> isEnabled() {
        return this.e;
    }
}
