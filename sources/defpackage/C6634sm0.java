package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.b0;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;

/* JADX INFO: renamed from: sm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6634sm0 implements Continuation, InterfaceC1608Nj0, C5690oH0.b, C2688aH1.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6634sm0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.C5690oH0.b
    public Object a() {
        return ((C5900pH0) this.e).d.B();
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        List<C7549x72> list;
        switch (this.d) {
            case 1:
                F72 f72 = (F72) obj;
                SF0 this$0 = (SF0) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (f72 == null || (list = f72.a) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    C7129v8 c7129v8M = this$0.d.m(String.valueOf(((C7549x72) it.next()).a));
                    if (c7129v8M != null) {
                        arrayList.add(c7129v8M);
                    }
                }
                return arrayList;
            case 2:
            default:
                M8 agentRepository = (M8) this.e;
                Intrinsics.checkNotNullParameter(agentRepository, "$agentRepository");
                String strB = ((AbstractC7844yZ0) obj).b();
                return !StringsKt.I(strB) ? agentRepository.f(strB) : new C7937z();
            case 3:
                AbstractC1075Go0 abstractC1075Go0 = (AbstractC1075Go0) obj;
                C5108lY0 this$1 = (C5108lY0) this.e;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                String strA = abstractC1075Go0 != null ? abstractC1075Go0.a() : null;
                return (strA == null || strA.length() == 0) ? new C7937z() : this$1.k.a(strA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019d  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x0122  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x019d, please report this as an issue */
    public EG1 b(EG1 event, C0841Do0 hint) {
        ConcurrentHashMap concurrentHashMap;
        String strJ;
        String strB;
        String str;
        C1318Jr0 c1318Jr0A;
        Object c5598nq0;
        String strA;
        String string;
        C1318Jr0 c1318Jr0;
        C1318Jr0 c1318Jr1;
        int i = 1;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "hint");
        o oVar = event.h;
        if (oVar != null && (concurrentHashMap = oVar.j) != null) {
            for (String str2 : ZF1.b) {
                Set setKeySet = concurrentHashMap.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (d.i((String) obj, str2)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    concurrentHashMap.put((String) it.next(), "[scrubbed]");
                }
            }
        }
        C6018pq0 c6018pq0 = (C6018pq0) this.e;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (!(event.a() instanceof SentryHttpClientException)) {
            return event;
        }
        Object objB = hint.b("okHttp:request");
        C4543is1 c4543is1 = objB instanceof C4543is1 ? (C4543is1) objB : null;
        if (c4543is1 == null || (c1318Jr1 = c4543is1.a) == null || (strJ = c1318Jr1.d) == null) {
            o oVar2 = event.h;
            strJ = U0.j(oVar2 != null ? oVar2.d : null);
        }
        if (c4543is1 == null || (c1318Jr0 = c4543is1.a) == null || (strB = c1318Jr0.b()) == null) {
            o oVar3 = event.h;
            if (oVar3 == null || (str = oVar3.d) == null) {
                strB = null;
            } else {
                Intrinsics.checkNotNullParameter(str, "<this>");
                try {
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    C1318Jr0.a aVar = new C1318Jr0.a();
                    aVar.e(null, str);
                    c1318Jr0A = aVar.a();
                } catch (IllegalArgumentException unused) {
                    c1318Jr0A = null;
                }
                if (c1318Jr0A != null) {
                    strB = c1318Jr0A.b();
                } else {
                    strB = null;
                }
            }
        }
        p pVarH = event.e.h();
        Integer num = pVarH != null ? pVarH.g : null;
        AbstractMap abstractMap = event.i;
        String str3 = abstractMap != null ? (String) abstractMap.get("auth.flow") : null;
        if (strJ == null || StringsKt.I(strJ)) {
            c5598nq0 = C5808oq0.a;
        } else {
            List<String> list = C6018pq0.e;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (num != null || (string = num.toString()) == null) {
                            string = "unknown";
                        }
                        if (num != null || !C6018pq0.b.e(num.intValue())) {
                            if (c6018pq0.a(strJ + "/" + string)) {
                                c5598nq0 = new C5598nq0(strJ, string, null, null);
                            } else {
                                c5598nq0 = C5388mq0.a;
                            }
                        } else if (str3 == null || str3.equals("launch")) {
                            if (strB == null) {
                                strB = "";
                            }
                            String strJ2 = CollectionsKt.J(StringsKt.R(strB, new char[]{'/'}), "/", null, null, new MB(i), 30);
                            if (strJ2.length() == 0) {
                                strJ2 = "/";
                            }
                            c5598nq0 = c6018pq0.a(strJ + strJ2 + "/" + string) ? new C5598nq0(strJ, string, strJ2, C6018pq0.c.contains(num) ? NG1.INFO : NG1.WARNING) : C5388mq0.a;
                        } else {
                            c5598nq0 = C5388mq0.a;
                        }
                    } else if (StringsKt.C(strJ, (String) it2.next(), true)) {
                        c5598nq0 = C5388mq0.a;
                    }
                }
            } else {
                if (num != null) {
                    string = "unknown";
                } else {
                    string = "unknown";
                }
                if (num != null) {
                    if (c6018pq0.a(strJ + "/" + string)) {
                        c5598nq0 = new C5598nq0(strJ, string, null, null);
                    } else {
                        c5598nq0 = C5388mq0.a;
                    }
                } else {
                    if (c6018pq0.a(strJ + "/" + string)) {
                        c5598nq0 = new C5598nq0(strJ, string, null, null);
                    } else {
                        c5598nq0 = C5388mq0.a;
                    }
                }
            }
        }
        if (c4543is1 != null && (strA = c4543is1.a("X-Request-Id")) != null) {
            event.b("http.request_id", strA);
        }
        if (Intrinsics.a(c5598nq0, C5808oq0.a)) {
            return event;
        }
        if (Intrinsics.a(c5598nq0, C5388mq0.a)) {
            return null;
        }
        if (!(c5598nq0 instanceof C5598nq0)) {
            throw new C6489s51();
        }
        C5598nq0 c5598nq1 = (C5598nq0) c5598nq0;
        String str4 = c5598nq1.c;
        String str5 = str4 != null ? "http-4xx" : "http-5xx";
        String str6 = c5598nq1.a;
        String str7 = c5598nq1.b;
        String[] elements = {str5, str6, str4, str7};
        Intrinsics.checkNotNullParameter(elements, "elements");
        event.g(C1526Mj.o(elements));
        event.b("http.host", str6);
        event.b("http.status_code", str7);
        String str8 = c5598nq1.c;
        if (str8 != null) {
            event.b("http.path", str8);
        }
        NG1 ng1 = c5598nq1.d;
        if (ng1 == null) {
            return event;
        }
        event.y = ng1;
        return event;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        ((C6844tm0) this.e).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        b0.f("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
