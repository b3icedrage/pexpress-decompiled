package defpackage;

import androidx.fragment.app.FragmentManager;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ty1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6882ty1 implements InterfaceC6672sy1 {

    @NotNull
    public final YD1 a;

    @NotNull
    public final InterfaceC7248vi0 b;

    @NotNull
    public final C3281d30 c;

    public C6882ty1(@NotNull YD1 partsProvider, @NotNull InterfaceC7248vi0 fragmentPartManager, @NotNull C3281d30 doubleStrategiesLocalExperiment) {
        Intrinsics.checkNotNullParameter(partsProvider, "partsProvider");
        Intrinsics.checkNotNullParameter(fragmentPartManager, "fragmentPartManager");
        Intrinsics.checkNotNullParameter(doubleStrategiesLocalExperiment, "doubleStrategiesLocalExperiment");
        this.a = partsProvider;
        this.b = fragmentPartManager;
        this.c = doubleStrategiesLocalExperiment;
    }

    @Override // defpackage.InterfaceC8066zc1
    public final void a() {
        this.a.o(YD1.a.e);
    }

    @Override // defpackage.InterfaceC8066zc1
    @Nullable
    public final Object b(int i, @NotNull FragmentManager fragmentManager, @NotNull JM<? super Unit> jm) {
        SimpleFragmentInflate<?, ?> simpleFragmentInflateR;
        YD1 yd1 = this.a;
        if (i == R.id.accountSelectionPart) {
            simpleFragmentInflateR = yd1.s();
        } else if (i == R.id.realAccountActivationPart) {
            simpleFragmentInflateR = yd1.k();
        } else if (i == R.id.footerPart) {
            simpleFragmentInflateR = yd1.j();
        } else if (i == R.id.startBtn) {
            simpleFragmentInflateR = yd1.f();
        } else if (i == R.id.investmentPart) {
            simpleFragmentInflateR = yd1.i();
        } else if (i == R.id.optionsPart) {
            simpleFragmentInflateR = yd1.b();
        } else if (i == R.id.riskManagementPart) {
            simpleFragmentInflateR = yd1.m();
        } else if (i == R.id.assetsPart) {
            simpleFragmentInflateR = yd1.d();
        } else if (i == R.id.strategiesPart) {
            simpleFragmentInflateR = this.c.o() ? yd1.u() : yd1.a();
        } else {
            if (i != R.id.indicatorPart) {
                return Unit.a;
            }
            simpleFragmentInflateR = yd1.r();
        }
        Object objA = this.b.a(simpleFragmentInflateR, i, fragmentManager, (LM) jm);
        return objA == MN.d ? objA : Unit.a;
    }
}
