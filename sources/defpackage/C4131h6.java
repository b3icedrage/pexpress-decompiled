package defpackage;

import androidx.fragment.app.FragmentManager;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4131h6 implements InterfaceC3921g6 {

    @NotNull
    public final YD1 a;

    @NotNull
    public final C7669xi0 b;

    public C4131h6(@NotNull YD1 partsProvider, @NotNull C7669xi0 fragmentPartManager) {
        Intrinsics.checkNotNullParameter(partsProvider, "partsProvider");
        Intrinsics.checkNotNullParameter(fragmentPartManager, "fragmentPartManager");
        this.a = partsProvider;
        this.b = fragmentPartManager;
    }

    @Override // defpackage.InterfaceC8066zc1
    public final void a() {
        this.a.o(YD1.a.d);
    }

    @Override // defpackage.InterfaceC8066zc1
    @Nullable
    public final Object b(int i, @NotNull FragmentManager fragmentManager, @NotNull JM<? super Unit> jm) {
        SimpleFragmentInflate<?, ?> simpleFragmentInflateV;
        YD1 yd1 = this.a;
        if (i == R.id.topStepsContainer) {
            simpleFragmentInflateV = yd1.q();
        } else if (i == R.id.bigStoriesContainer) {
            simpleFragmentInflateV = yd1.t();
        } else if (i == R.id.stepDescriptionContainer) {
            simpleFragmentInflateV = yd1.x();
        } else {
            if (i != R.id.actionButtonContainer) {
                throw new IllegalStateException("No part with such id was found.");
            }
            simpleFragmentInflateV = yd1.v();
        }
        Object objA = this.b.a(simpleFragmentInflateV, i, fragmentManager, (LM) jm);
        return objA == MN.d ? objA : Unit.a;
    }
}
