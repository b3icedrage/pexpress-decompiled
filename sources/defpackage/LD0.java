package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LD0 extends MD0<InterfaceC6237qt0> {
    public static final ArrayList l;

    static {
        ArrayList arrayList = new ArrayList();
        l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("DEBUG");
        arrayList.add("INFO");
        arrayList.add("WARN");
        arrayList.add("ERROR");
        arrayList.add("event");
        arrayList.add("message");
        arrayList.add("formattedMessage");
        arrayList.add("logger");
        arrayList.add("loggerContext");
        arrayList.add("level");
        arrayList.add("timeStamp");
        arrayList.add("marker");
        arrayList.add("mdc");
        arrayList.add("throwableProxy");
        arrayList.add("throwable");
        Class cls = Integer.TYPE;
        arrayList2.add(cls);
        arrayList2.add(cls);
        arrayList2.add(cls);
        arrayList2.add(cls);
        arrayList2.add(InterfaceC6237qt0.class);
        arrayList2.add(String.class);
        arrayList2.add(String.class);
        arrayList2.add(String.class);
        arrayList2.add(KS0.class);
        arrayList2.add(cls);
        arrayList2.add(Long.TYPE);
        arrayList2.add(UW0.class);
        arrayList2.add(Map.class);
        arrayList2.add(InterfaceC3882fv0.class);
        arrayList2.add(Throwable.class);
    }

    @Override // defpackage.MD0
    public final String q() {
        throw null;
    }

    @Override // defpackage.MD0
    public final Object[] r(InterfaceC6237qt0 interfaceC6237qt0) {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Object[] objArr = new Object[l.size() + size];
        int iValueOf = 10000;
        int i = 0;
        objArr[0] = iValueOf;
        objArr[1] = 20000;
        objArr[2] = 30000;
        objArr[3] = 40000;
        objArr[4] = interfaceC6237qt0;
        objArr[5] = interfaceC6237qt0.getMessage();
        objArr[6] = interfaceC6237qt0.d();
        objArr[7] = interfaceC6237qt0.c();
        objArr[8] = interfaceC6237qt0.f();
        C5714oP0 level = interfaceC6237qt0.getLevel();
        int i2 = level.d;
        if (i2 == Integer.MIN_VALUE) {
            iValueOf = Integer.MIN_VALUE;
        } else if (i2 == 5000) {
            iValueOf = 5000;
        } else if (i2 != 10000) {
            if (i2 == 20000) {
                iValueOf = 20000;
            } else if (i2 == 30000) {
                iValueOf = 30000;
            } else if (i2 == 40000) {
                iValueOf = 40000;
            } else {
                if (i2 != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Level " + level.e + ", " + i2 + " is unknown.");
                }
                iValueOf = Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }
        objArr[9] = iValueOf;
        objArr[10] = Long.valueOf(interfaceC6237qt0.b());
        objArr[11] = interfaceC6237qt0.g();
        objArr[12] = interfaceC6237qt0.k();
        InterfaceC3882fv0 interfaceC3882fv0H = interfaceC6237qt0.h();
        if (interfaceC3882fv0H != null) {
            objArr[13] = interfaceC3882fv0H;
            if (interfaceC3882fv0H instanceof PY1) {
                objArr[14] = null;
            } else {
                objArr[14] = null;
            }
        } else {
            objArr[13] = null;
            objArr[14] = null;
        }
        int i3 = 15;
        while (i < size) {
            objArr[i3] = (C6158qX0) arrayList.get(i);
            i++;
            i3++;
        }
        return objArr;
    }
}
