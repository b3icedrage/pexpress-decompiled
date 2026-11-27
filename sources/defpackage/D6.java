package defpackage;

import com.pexpress.tool.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class D6 {

    @NotNull
    public final C6895u2 a;

    @NotNull
    public final C6895u2 b;

    public D6() {
        EnumC5298mQ1 enumC5298mQ1 = EnumC5298mQ1.SecondStep;
        this.a = new C6895u2(new C6685t2(enumC5298mQ1, R.string.unavailable_trading_step2, R.drawable.ic_activation_step, true, true), new C6685t2(EnumC5298mQ1.EmptyStep, R.string.unavailable_trading_step1_done, R.drawable.ic_status_done, true, false));
        this.b = new C6895u2(new C6685t2(EnumC5298mQ1.FirstStep, R.string.unavailable_trading_step1, R.drawable.ic_activation_step, true, true), new C6685t2(enumC5298mQ1, R.string.unavailable_trading_step2, R.drawable.ic_activation_step_pending, false, false));
    }
}
