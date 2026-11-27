package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Dz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0875Dz1 implements InterfaceC7773yB1 {
    @Override // defpackage.InterfaceC7773yB1
    public final void a(LinkedHashMap out) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.put("ws_clients_created_total", Integer.valueOf(C8103zl2.a.get()));
        out.put("jvm_thread_count", Integer.valueOf(Thread.activeCount()));
        Runtime runtime = Runtime.getRuntime();
        out.put("mem_used_mb", Long.valueOf((runtime.totalMemory() - runtime.freeMemory()) / C2688aH1.MAX_EVENT_SIZE_BYTES));
        out.put("mem_max_mb", Long.valueOf(runtime.maxMemory() / C2688aH1.MAX_EVENT_SIZE_BYTES));
    }
}
