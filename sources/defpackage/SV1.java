package defpackage;

import androidx.fragment.app.FragmentManager;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SV1 implements RV1 {

    @NotNull
    public final YD1 a;

    @NotNull
    public final InterfaceC7248vi0 b;

    public SV1(@NotNull YD1 partsProvider, @NotNull InterfaceC7248vi0 fragmentPartManager) {
        Intrinsics.checkNotNullParameter(partsProvider, "partsProvider");
        Intrinsics.checkNotNullParameter(fragmentPartManager, "fragmentPartManager");
        this.a = partsProvider;
        this.b = fragmentPartManager;
    }

    @Override // defpackage.InterfaceC8066zc1
    public final void a() {
        this.a.o(YD1.a.h);
    }

    @Override // defpackage.InterfaceC8066zc1
    @Nullable
    public final Object b(int i, @NotNull FragmentManager fragmentManager, @NotNull JM<? super Unit> jm) {
        SimpleFragmentInflate<?, ?> simpleFragmentInflateL;
        YD1 yd1 = this.a;
        if (i == R.id.support_need_help_placeholder) {
            simpleFragmentInflateL = yd1.g();
        } else if (i == R.id.support_faq_placeholder) {
            simpleFragmentInflateL = yd1.e();
        } else if (i == R.id.support_popular_questions_placeholder) {
            simpleFragmentInflateL = yd1.c();
        } else {
            if (i != R.id.support_issue_categories_placeholder) {
                return Unit.a;
            }
            simpleFragmentInflateL = yd1.l();
        }
        Object objA = this.b.a(simpleFragmentInflateL, i, fragmentManager, (LM) jm);
        return objA == MN.d ? objA : Unit.a;
    }
}
