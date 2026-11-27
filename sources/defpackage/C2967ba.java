package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.Amplitude$build$built$1", f = "Amplitude.kt", l = {117}, m = "invokeSuspend")
public final class C2967ba extends AW1 implements Function2<KN, JM<? super Boolean>, Object> {
    public int d;
    public final /* synthetic */ C4693ja e;
    public final /* synthetic */ C4693ja g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2967ba(C4693ja c4693ja, C4693ja c4693ja2, JM jm) {
        super(2, jm);
        this.e = c4693ja;
        this.g = c4693ja2;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C2967ba(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Boolean> jm) {
        return ((C2967ba) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4693ja c4693ja = this.e;
            MI configuration = c4693ja.a;
            C4019gb c4019gb = configuration.e;
            C4693ja amplitude = this.g;
            c4019gb.getClass();
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            MI configuration2 = amplitude.a;
            Intrinsics.c(configuration2, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            SharedPreferences sharedPreferences = configuration2.a.getSharedPreferences("amplitude-events-" + configuration2.d, 0);
            DS0 ds0A = configuration2.f.a(amplitude);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
            Intrinsics.checkNotNullParameter(configuration2, "configuration");
            c4693ja.i = new C1502Mb(configuration2.d, ds0A, sharedPreferences, new File(configuration2.a(), "events"), amplitude.o);
            configuration.n.getClass();
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            MI configuration3 = amplitude.a;
            Intrinsics.c(configuration3, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            SharedPreferences sharedPreferences2 = configuration3.a.getSharedPreferences("amplitude-identify-intercept-" + configuration3.d, 0);
            DS0 ds0A2 = configuration3.f.a(amplitude);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "sharedPreferences");
            Intrinsics.checkNotNullParameter(configuration3, "configuration");
            c4693ja.j = new C1502Mb(configuration3.d, ds0A2, sharedPreferences2, new File(configuration3.a(), "identify-intercept"), amplitude.o);
            Intrinsics.c(configuration, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            C1563Mv0 c1563Mv0 = new C1563Mv0(configuration.d, configuration.o, configuration.a(), "identity", configuration.f.a(c4693ja));
            c4693ja.k = configuration.o.i(c1563Mv0);
            this.d = 1;
            if (C4693ja.n(amplitude, c1563Mv0, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Boolean.TRUE;
    }
}
