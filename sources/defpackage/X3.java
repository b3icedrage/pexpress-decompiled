package defpackage;

import androidx.fragment.app.FragmentManager;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class X3 implements W3 {

    @NotNull
    public final YD1 a;

    @NotNull
    public final InterfaceC7248vi0 b;

    public X3(@NotNull YD1 partsProvider, @NotNull InterfaceC7248vi0 fragmentPartManager) {
        Intrinsics.checkNotNullParameter(partsProvider, "partsProvider");
        Intrinsics.checkNotNullParameter(fragmentPartManager, "fragmentPartManager");
        this.a = partsProvider;
        this.b = fragmentPartManager;
    }

    @Override // defpackage.InterfaceC8066zc1
    public final void a() {
        this.a.o(YD1.a.g);
    }

    @Override // defpackage.InterfaceC8066zc1
    @Nullable
    public final Object b(int i, @NotNull FragmentManager fragmentManager, @NotNull JM<? super Unit> jm) {
        SimpleFragmentInflate<?, ?> simpleFragmentInflateW;
        YD1 yd1 = this.a;
        if (i == R.id.account_main_info_part_placeholder) {
            simpleFragmentInflateW = yd1.h();
        } else if (i == R.id.account_balance_part_placeholder) {
            simpleFragmentInflateW = yd1.n();
        } else if (i == R.id.account_settings_placeholder) {
            simpleFragmentInflateW = yd1.p();
        } else {
            if (i != R.id.account_logout_part_placeholder) {
                return Unit.a;
            }
            simpleFragmentInflateW = yd1.w();
        }
        Object objA = this.b.a(simpleFragmentInflateW, i, fragmentManager, (LM) jm);
        return objA == MN.d ? objA : Unit.a;
    }
}
