package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.jivosite.sdk.model.pojo.message.ClientMessage;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.pexpress.tool.MainActivityImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RF0 implements InterfaceC1608Nj0, K81, C2688aH1.o, Continuation {
    public final /* synthetic */ Object d;

    public /* synthetic */ RF0(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.K81
    public C3006bj2 N(View v, C3006bj2 windowInsets) {
        int i = MainActivityImpl.R;
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        C3006bj2.k kVar = windowInsets.a;
        LA0 la0F = kVar.f(7);
        Intrinsics.checkNotNullExpressionValue(la0F, "getInsets(...)");
        Integer num = (Integer) ((MainActivityImpl) this.d).w().o().d();
        int i2 = (num != null && num.intValue() == 16) ? kVar.f(8).d : 0;
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = la0F.a;
        marginLayoutParams.bottomMargin = Math.max(la0F.d, i2);
        marginLayoutParams.rightMargin = la0F.c;
        marginLayoutParams.topMargin = la0F.b;
        v.setLayoutParams(marginLayoutParams);
        return C3006bj2.b;
    }

    public Double a(C6935uC1 ctx) {
        double d;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        String str = ctx.a.t;
        Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        boolean zO = d.o(str, "robot.", false);
        ZF1.a aVar = (ZF1.a) this.d;
        if (zO) {
            d = aVar.a;
        } else if (d.o(str, "auth.", false)) {
            d = aVar.b;
        } else {
            d = d.o(str, "launch.", false) ? aVar.c : aVar.d;
        }
        return Double.valueOf(d);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02af  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c9  */
    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        List<C0997Fo0> list;
        String str;
        RA ra;
        TD td;
        SF0.c it = (SF0.c) obj;
        SF0 this$0 = (SF0) this.d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.getClass();
        boolean zI = StringsKt.I(it.a);
        boolean z = it.b;
        if (zI) {
            if (z) {
                return VE.c(new C7881yi2());
            }
            List list2 = Collections.EMPTY_LIST;
            Intrinsics.checkNotNullExpressionValue(list2, "{\n                Collec…emptyList()\n            }");
            return list2;
        }
        ArrayList arrayList = new ArrayList(it.b());
        TreeMap treeMap = new TreeMap(new PF0(0));
        C2013So0 c2013So0 = it.d;
        Iterator<T> it2 = c2013So0.a.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            list = c2013So0.a;
            str = it.a;
            if (!zHasNext) {
                break;
            }
            C0997Fo0 c0997Fo0 = (C0997Fo0) it2.next();
            boolean zA = Intrinsics.a(c0997Fo0.c, str);
            long j = c0997Fo0.g;
            if (zA) {
                SF0.m(treeMap, j, new TD(c0997Fo0, AbstractC3926g70.d.a));
            } else {
                AbstractC3926g70.d dVar = AbstractC3926g70.d.a;
                C0997Fo0 c0997Fo1 = (C0997Fo0) CollectionsKt.N(list);
                SF0.m(treeMap, j, new L8(c0997Fo0, dVar, j >= (c0997Fo1 != null ? c0997Fo1.g : 0L)));
            }
        }
        for (ClientMessage clientMessage : it.e.a) {
            SF0.m(treeMap, clientMessage.b, new LF1(clientMessage, AbstractC3926g70.d.a));
        }
        for (AbstractC5723oS0.c cVar : it.f) {
            SF0.m(treeMap, cVar.b, new C5241m80(cVar.c, cVar.d));
        }
        for (Map.Entry<String, C2980bd0> entry : it.g.a.entrySet()) {
            SF0.m(treeMap, entry.getValue().e, new C8059za2(entry.getValue(), AbstractC3926g70.d.a));
        }
        ClientMessage clientMessage2 = it.h.a;
        if (clientMessage2 != null) {
            SF0.m(treeMap, clientMessage2.b, new LF1(clientMessage2, AbstractC3926g70.d.a));
        }
        CL cl = it.i;
        if (cl.b != null) {
            C0997Fo0 c0997Fo2 = (C0997Fo0) CollectionsKt.firstOrNull(list);
            SF0.m(treeMap, c0997Fo2 != null ? c0997Fo2.g + 1 : cl.b.d, new C3970gL(cl));
        }
        for (SocketMessage socketMessage : it.j.a) {
            SF0.m(treeMap, ((Number) C3481e1.e(socketMessage.c).e).longValue(), new D92(socketMessage));
        }
        C1774Pm1 c1774Pm1 = it.k;
        if (!(c1774Pm1.b instanceof AbstractC8106zm1.b)) {
            SF0.m(treeMap, c1774Pm1.c, new C7896ym1(c1774Pm1));
        }
        ArrayList arrayList2 = new ArrayList(it.b());
        Collection<RA> collectionValues = treeMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "messages.values");
        for (RA message : collectionValues) {
            AbstractC7844yZ0 abstractC7844yZ0 = (AbstractC7844yZ0) CollectionsKt.N(arrayList);
            if (message instanceof AbstractC7844yZ0) {
                AbstractC7844yZ0 abstractC7844yZ1 = (AbstractC7844yZ0) message;
                String strB = StringsKt.I(abstractC7844yZ1.b()) ? str : abstractC7844yZ1.b();
                String strB2 = null;
                String strB3 = abstractC7844yZ0 != null ? abstractC7844yZ0.b() : null;
                if (strB3 == null || StringsKt.I(strB3)) {
                    strB2 = str;
                } else if (abstractC7844yZ0 != null) {
                    strB2 = abstractC7844yZ0.b();
                }
                if (strB2 == null) {
                    arrayList.add(message);
                } else {
                    if (!Intrinsics.a(strB, strB2)) {
                        SF0.k(str, arrayList, arrayList2);
                    }
                    arrayList.add(message);
                }
            } else if (message instanceof C5241m80) {
                SF0.k(str, arrayList, arrayList2);
                Intrinsics.checkNotNullExpressionValue(message, "message");
                C5241m80 event = (C5241m80) message;
                Intrinsics.checkNotNullParameter(event, "event");
                arrayList2.add(new C6290r80(5, event));
            } else if (message instanceof C3970gL) {
                SF0.k(str, arrayList, arrayList2);
                Intrinsics.checkNotNullExpressionValue(message, "message");
                C3970gL message2 = (C3970gL) message;
                Intrinsics.checkNotNullParameter(message2, "message");
                arrayList2.add(new C4180hL(15, message2));
            } else if (message instanceof D92) {
                SF0.k(str, arrayList, arrayList2);
                Intrinsics.checkNotNullExpressionValue(message, "message");
                D92 unsupportedEntry = (D92) message;
                Intrinsics.checkNotNullParameter(unsupportedEntry, "unsupportedEntry");
                arrayList2.add(new E92(16, unsupportedEntry));
            } else if (message instanceof C7896ym1) {
                SF0.k(str, arrayList, arrayList2);
                Intrinsics.checkNotNullExpressionValue(message, "message");
                C7896ym1 entry2 = (C7896ym1) message;
                Intrinsics.checkNotNullParameter(entry2, "entry");
                arrayList2.add(new C0602Am1(17, entry2));
            }
        }
        if (!arrayList.isEmpty()) {
            SF0.k(str, arrayList, arrayList2);
        }
        if (it.c && this$0.o.b() && !arrayList2.isEmpty()) {
            Collection collection = (List) this$0.C.d();
            if (collection == null) {
                collection = C5653o60.d;
            }
            if (collection == null || !collection.isEmpty()) {
                Iterator it3 = collection.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        ra = ((C3520eB) CollectionsKt.F(arrayList2)).b;
                        if (ra instanceof TD) {
                            td = (TD) ra;
                            if (Intrinsics.a(td.a.e, TZ0.d.a) || Intrinsics.a(td.a.e, TZ0.a.a)) {
                                arrayList2.add(0, new G8(14, C5029l81.a));
                            }
                        }
                    } else if (Intrinsics.a(((C7129v8) it3.next()).b, AbstractC3723f9.b.a)) {
                    }
                }
            } else {
                ra = ((C3520eB) CollectionsKt.F(arrayList2)).b;
                if (ra instanceof TD) {
                    td = (TD) ra;
                    if (Intrinsics.a(td.a.e, TZ0.d.a)) {
                        arrayList2.add(0, new G8(14, C5029l81.a));
                    } else {
                        arrayList2.add(0, new G8(14, C5029l81.a));
                    }
                }
            }
        }
        if (z) {
            arrayList2.add(new C7881yi2());
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        if (zIsSuccessful) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }
}
