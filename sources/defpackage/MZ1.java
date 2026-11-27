package defpackage;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class MZ1 extends CancellationException implements InterfaceC3347dN<MZ1> {

    @Nullable
    public final transient NZ1 d;

    public MZ1(@NotNull String str, @Nullable NZ1 nz1) {
        super(str);
        this.d = nz1;
    }

    @Override // defpackage.InterfaceC3347dN
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        MZ1 mz1 = new MZ1(message, this.d);
        mz1.initCause(this);
        return mz1;
    }
}
