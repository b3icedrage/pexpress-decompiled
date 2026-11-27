package defpackage;

import android.database.Cursor;
import android.util.Base64;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* JADX INFO: renamed from: ka0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4904ka0 implements InterfaceC5056lH, InterfaceC1608Nj0, SB1.a, C2688aH1.a {
    public final /* synthetic */ int d;

    public /* synthetic */ C4904ka0(int i) {
        this.d = i;
    }

    @Override // defpackage.C2688aH1.a
    public C0702Bu a(C0702Bu breadcrumb, C0841Do0 c0841Do0) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        Intrinsics.checkNotNullParameter(c0841Do0, "<unused var>");
        ConcurrentHashMap concurrentHashMap = breadcrumb.j;
        Intrinsics.checkNotNullExpressionValue(concurrentHashMap, "getData(...)");
        for (String str : ZF1.c) {
            List listE0 = CollectionsKt.e0(concurrentHashMap.keySet());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE0) {
                if (d.i((String) obj, str)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                breadcrumb.f("[scrubbed]", (String) it.next());
            }
        }
        return breadcrumb;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        String str;
        switch (this.d) {
            case 1:
                return ((C3513e9) obj).b;
            case 2:
                C7129v8 c7129v8 = (C7129v8) obj;
                return (c7129v8 == null || (str = c7129v8.e) == null) ? "" : str;
            default:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null backendName");
                    }
                    EnumC6825th1 enumC6825th1B = C7456wh1.b(cursor.getInt(2));
                    String string2 = cursor.getString(3);
                    arrayList.add(new C1778Po(string, string2 == null ? null : Base64.decode(string2, 0), enumC6825th1B));
                }
                return arrayList;
        }
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        C3980gO0<ScheduledExecutorService> c3980gO0 = ExecutorsRegistrar.a;
        return EnumC5663o82.d;
    }
}
