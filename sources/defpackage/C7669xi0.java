package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7669xi0 implements InterfaceC7248vi0 {
    @Override // defpackage.InterfaceC7248vi0
    @Nullable
    public final Object a(@NotNull SimpleFragmentInflate simpleFragmentInflate, int i, @NotNull FragmentManager fragmentManager, @NotNull LM lm) {
        if (fragmentManager.A(i) != null) {
            return Unit.a;
        }
        a aVar = new a(fragmentManager);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction()");
        aVar.c(i, simpleFragmentInflate, simpleFragmentInflate.getClass().getCanonicalName(), 1);
        if (aVar.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar.h = false;
        aVar.q.y(aVar, true);
        Object objP = C4466ii.p(simpleFragmentInflate.k, new C7459wi0(2, null), lm);
        return objP == MN.d ? objP : Unit.a;
    }
}
