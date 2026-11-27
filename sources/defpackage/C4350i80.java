package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: i80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4350i80 implements InterfaceC6569sU1, InterfaceC2318Wk1 {
    public final HashMap a;
    public ArrayDeque b;
    public final EnumC5663o82 c;

    public C4350i80() {
        EnumC5663o82 enumC5663o82 = EnumC5663o82.d;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = enumC5663o82;
    }

    @Override // defpackage.InterfaceC6569sU1
    public final void a(C2984be0 c2984be0) {
        b(this.c, c2984be0);
    }

    @Override // defpackage.InterfaceC6569sU1
    public final synchronized void b(Executor executor, InterfaceC5871p80 interfaceC5871p80) {
        try {
            executor.getClass();
            if (!this.a.containsKey(C6561sS.class)) {
                this.a.put(C6561sS.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(C6561sS.class)).put(interfaceC5871p80, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
