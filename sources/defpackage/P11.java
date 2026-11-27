package defpackage;

import com.appsflyer.share.attribution.RequestError;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.stop_triggers.MultipleStopChecker", f = "MultipleStopChecker.kt", l = {RequestError.NO_DEV_KEY}, m = "checkShouldStop")
public final class P11 extends LM {
    public C7398wQ1 d;
    public Iterator e;
    public /* synthetic */ Object g;
    public final /* synthetic */ Q11 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P11(Q11 q11, LM lm) {
        super(lm);
        this.h = q11;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
