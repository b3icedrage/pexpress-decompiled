package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"LzP1;", "", "LtI1;", "services", "<init>", "(LtI1;)V", "", "bootstrap", "()V", "scheduleStart", "LtI1;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C8025zP1 {

    @NotNull
    private final C6743tI1 services;

    public C8025zP1(@NotNull C6743tI1 services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.services = services;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scheduleStart$lambda-2, reason: not valid java name */
    public static final void m39scheduleStart$lambda2(C8025zP1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.services.getAllServices(InterfaceC2529Yu0.class).iterator();
        while (it.hasNext()) {
            ((InterfaceC2529Yu0) it.next()).start();
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(InterfaceC3244cs0.class).iterator();
        while (it.hasNext()) {
            ((InterfaceC3244cs0) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        new Thread(new DF0(this, 3)).start();
    }
}
