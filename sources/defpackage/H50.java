package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LH50;", "LuU1;", "LAs0;", "LAU1;", "model", "<init>", "(LAU1;)V", "", "getEmail", "()Ljava/lang/String;", "email", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class H50 extends AbstractC6989uU1 implements InterfaceC0619As0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H50(@NotNull AU1 model) {
        super(model);
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // defpackage.InterfaceC0619As0
    @NotNull
    public String getEmail() {
        return getModel().getAddress();
    }
}
