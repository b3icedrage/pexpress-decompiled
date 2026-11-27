package defpackage;

import com.pexpress.tool.R;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class HO implements GO {

    @NotNull
    public final KW1 a = XO0.b(new R4(this, 4));

    @NotNull
    public final FO b = new FO(R.string.trade_with_ai_title, "ai_indicator");

    @NotNull
    public final FO c = new FO(R.string.trading_on_real_account_text, "flags");

    @NotNull
    public final FO d = new FO(R.string.instant_support_label, "support");

    @Override // defpackage.GO
    @NotNull
    public final List<FO> a() {
        return (List) this.a.getValue();
    }
}
