package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LT1 implements KT1 {
    @Override // defpackage.KT1
    @NotNull
    public final JT1 a(@NotNull TT1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return new JT1(R.drawable.img_stub_results_win, R.string.seems_like_you_pro_title);
        }
        if (iOrdinal == 1) {
            return new JT1(R.drawable.img_stub_results_lose, R.string.almost_there_text);
        }
        throw new C6489s51();
    }
}
