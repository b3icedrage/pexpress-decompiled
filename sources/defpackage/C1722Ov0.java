package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ov0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1722Ov0 implements InterfaceC5978pf1 {
    public C3720f80 d;

    @Override // defpackage.InterfaceC5978pf1
    public final void a(@NotNull C3595ea amplitude) {
        C3510e80 c3510e80;
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        e(amplitude);
        Object obj = C3510e80.b;
        String instanceName = amplitude.a.d;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        synchronized (C3510e80.b) {
            try {
                LinkedHashMap linkedHashMap = C3510e80.c;
                Object c3510e81 = linkedHashMap.get(instanceName);
                if (c3510e81 == null) {
                    c3510e81 = new C3510e80();
                    linkedHashMap.put(instanceName, c3510e81);
                }
                c3510e80 = (C3510e80) c3510e81;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = c3510e80.a;
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void e(@NotNull C3595ea c3595ea) {
        Intrinsics.checkNotNullParameter(c3595ea, "<set-?>");
    }

    @Override // defpackage.InterfaceC5978pf1
    @Nullable
    public final C0612Aq g(@NotNull C0612Aq event) {
        C3301d80 c3301d80;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.P != null) {
            C3720f80 c3720f80 = this.d;
            if (c3720f80 == null) {
                Intrinsics.l("eventBridge");
                throw null;
            }
            EnumC4608j80 channel = EnumC4608j80.d;
            Intrinsics.checkNotNullParameter(event, "<this>");
            C3091c80 event2 = new C3091c80(event.a(), event.O, event.P, event.Q, event.R);
            Intrinsics.checkNotNullParameter(channel, "channel");
            Intrinsics.checkNotNullParameter(event2, "event");
            synchronized (c3720f80.a) {
                try {
                    LinkedHashMap linkedHashMap = c3720f80.b;
                    Object c3301d81 = linkedHashMap.get(channel);
                    if (c3301d81 == null) {
                        c3301d81 = new C3301d80(channel);
                        linkedHashMap.put(channel, c3301d81);
                    }
                    c3301d80 = (C3301d80) c3301d81;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Intrinsics.checkNotNullParameter(event2, "event");
            synchronized (c3301d80.b) {
                c3301d80.c.offer(event2);
            }
        }
        return event;
    }

    @Override // defpackage.InterfaceC5978pf1
    @NotNull
    public final InterfaceC5978pf1.a getType() {
        return InterfaceC5978pf1.a.d;
    }
}
