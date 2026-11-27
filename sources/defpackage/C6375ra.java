package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6375ra implements InterfaceC5978pf1 {
    public C5536na d;

    /* JADX INFO: renamed from: ra$a */
    public static final class a extends ML0 implements Function1<C7426wa, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7426wa c7426wa) {
            C7426wa c7426wa2 = c7426wa;
            Intrinsics.checkNotNullParameter(c7426wa2, "<name for destructuring parameter 0>");
            c7426wa2.getClass();
            C0612Aq c0612Aq = new C0612Aq();
            Intrinsics.checkNotNullParameter(null, "<set-?>");
            c0612Aq.N = null;
            throw null;
        }
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void a(@NotNull C3595ea amplitude) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        e(amplitude);
        String str = amplitude.a.d;
        Object obj = C5536na.c;
        C5536na c5536naA = C5536na.a.a(str);
        this.d = c5536naA;
        C3930g80 c3930g80 = c5536naA.b;
        a aVar = new a(1);
        synchronized (c3930g80.a) {
            arrayList = new ArrayList();
            c3930g80.b.drainTo(arrayList);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            aVar.invoke((C7426wa) it.next());
            throw null;
        }
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void e(@NotNull C3595ea c3595ea) {
        Intrinsics.checkNotNullParameter(c3595ea, "<set-?>");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.InterfaceC5978pf1
    @Nullable
    public final C0612Aq g(@NotNull C0612Aq event) {
        Intrinsics.checkNotNullParameter(event, "event");
        LinkedHashMap linkedHashMap = event.P;
        if (linkedHashMap == null || linkedHashMap.isEmpty() || Intrinsics.a(event.a(), "$exposure")) {
            return event;
        }
        HashMap actions = new HashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                try {
                    actions.put(str, (Map) value);
                } catch (ClassCastException e) {
                    e.printStackTrace();
                }
            }
        }
        C5536na c5536na = this.d;
        if (c5536na == null) {
            Intrinsics.l("connector");
            throw null;
        }
        C2454Xv0 c2454Xv0 = c5536na.a;
        ReentrantReadWriteLock.ReadLock lock = c2454Xv0.a.readLock();
        lock.lock();
        try {
            C1330Jv0 c1330Jv0 = c2454Xv0.b;
            lock.unlock();
            String str2 = c1330Jv0.a;
            ?? r4 = c1330Jv0.c;
            Intrinsics.checkNotNullParameter(actions, "actions");
            LinkedHashMap linkedHashMapL = PW0.l(r4);
            for (Map.Entry entry2 : actions.entrySet()) {
                String str3 = (String) entry2.getKey();
                Map map = (Map) entry2.getValue();
                int iHashCode = str3.hashCode();
                if (iHashCode != 1186238) {
                    if (iHashCode != 146417720) {
                        if (iHashCode == 1142092165 && str3.equals("$unset")) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                linkedHashMapL.remove(((Map.Entry) it.next()).getKey());
                            }
                        }
                    } else if (str3.equals("$clearAll")) {
                        linkedHashMapL.clear();
                    }
                } else if (str3.equals("$set")) {
                    linkedHashMapL.putAll(map);
                }
            }
            c2454Xv0.a(new C1330Jv0(linkedHashMapL, str2, c1330Jv0.b));
            return event;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5978pf1
    @NotNull
    public final InterfaceC5978pf1.a getType() {
        return InterfaceC5978pf1.a.d;
    }
}
