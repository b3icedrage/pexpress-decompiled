package defpackage;

import com.jivosite.sdk.model.pojo.push.Notification;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HV implements InterfaceC4061gl1 {

    @NotNull
    public final Map<String, InterfaceC3851fl1> a;

    /* JADX WARN: Multi-variable type inference failed */
    public HV(@NotNull Map<String, ? extends InterfaceC3851fl1> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.a = delegates;
    }

    @Override // defpackage.InterfaceC4061gl1
    public final void a(@NotNull C3641el1 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.a("Push message \"" + data + '\"');
        Notification notification = data.b;
        InterfaceC3851fl1 interfaceC3851fl1 = this.a.get(notification.a);
        if (interfaceC3851fl1 != null) {
            interfaceC3851fl1.a(data);
            return;
        }
        C6104qF0.h("There is no delegate to handle push message");
        C6104qF0.h(" --> key=" + notification.a);
    }
}
