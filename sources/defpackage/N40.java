package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class N40 implements N80 {

    @NotNull
    public final Map<Throwable, Object> d = Collections.synchronizedMap(new WeakHashMap());

    @NotNull
    public final C2688aH1 e;

    public N40(@NotNull C2688aH1 c2688aH1) {
        this.e = c2688aH1;
    }

    @Override // defpackage.N80
    @Nullable
    public final EG1 f(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0) {
        C2688aH1 c2688aH1 = this.e;
        if (!c2688aH1.isEnableDeduplication()) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return eg1;
        }
        Throwable thA = eg1.a();
        if (thA == null) {
            return eg1;
        }
        Map<Throwable, Object> map = this.d;
        if (!map.containsKey(thA)) {
            ArrayList arrayList = new ArrayList();
            for (Throwable cause = thA; cause.getCause() != null; cause = cause.getCause()) {
                arrayList.add(cause.getCause());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (map.containsKey(it.next())) {
                }
            }
            map.put(thA, null);
            return eg1;
        }
        c2688aH1.getLogger().a(NG1.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", eg1.d);
        return null;
    }
}
