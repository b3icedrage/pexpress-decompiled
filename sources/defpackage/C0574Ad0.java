package defpackage;

import android.text.TextUtils;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: Ad0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0574Ad0 {
    public final InterfaceC1612Nk1<InterfaceC5746oa> a;
    public Integer b = null;

    public C0574Ad0(InterfaceC1612Nk1 interfaceC1612Nk1) {
        this.a = interfaceC1612Nk1;
    }

    public final void a(ArrayList arrayList) throws I1 {
        InterfaceC1612Nk1<InterfaceC5746oa> interfaceC1612Nk1 = this.a;
        if (interfaceC1612Nk1.get() == null) {
            throw new I1("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<J1> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String[] strArr = J1.g;
            ArrayList arrayList3 = new ArrayList();
            String[] strArr2 = J1.g;
            for (int i = 0; i < 5; i++) {
                String str = strArr2[i];
                if (!map.containsKey(str)) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                throw new I1(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
            }
            try {
                arrayList2.add(new J1((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", J1.h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new I1("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new I1("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
        if (arrayList2.isEmpty()) {
            if (interfaceC1612Nk1.get() == null) {
                throw new I1("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            Iterator it2 = interfaceC1612Nk1.get().b().iterator();
            while (it2.hasNext()) {
                interfaceC1612Nk1.get().g(((InterfaceC5746oa.a) it2.next()).b);
            }
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            hashSet.add(((J1) it3.next()).a);
        }
        ArrayList<InterfaceC5746oa.a> arrayListB = interfaceC1612Nk1.get().b();
        HashSet hashSet2 = new HashSet();
        Iterator it4 = arrayListB.iterator();
        while (it4.hasNext()) {
            hashSet2.add(((InterfaceC5746oa.a) it4.next()).b);
        }
        ArrayList arrayList4 = new ArrayList();
        for (InterfaceC5746oa.a aVar : arrayListB) {
            if (!hashSet.contains(aVar.b)) {
                arrayList4.add(aVar);
            }
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            interfaceC1612Nk1.get().g(((InterfaceC5746oa.a) it5.next()).b);
        }
        ArrayList<J1> arrayList5 = new ArrayList();
        for (J1 j1 : arrayList2) {
            if (!hashSet2.contains(j1.a)) {
                arrayList5.add(j1);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(interfaceC1612Nk1.get().b());
        if (this.b == null) {
            this.b = Integer.valueOf(interfaceC1612Nk1.get().f());
        }
        int iIntValue = this.b.intValue();
        for (J1 j2 : arrayList5) {
            while (arrayDeque.size() >= iIntValue) {
                interfaceC1612Nk1.get().g(((InterfaceC5746oa.a) arrayDeque.pollFirst()).b);
            }
            j2.getClass();
            InterfaceC5746oa.a aVar2 = new InterfaceC5746oa.a();
            aVar2.a = "frc";
            aVar2.m = j2.d.getTime();
            aVar2.b = j2.a;
            aVar2.c = j2.b;
            String str2 = j2.c;
            if (TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            aVar2.d = str2;
            aVar2.e = j2.e;
            aVar2.j = j2.f;
            interfaceC1612Nk1.get().d(aVar2);
            arrayDeque.offer(aVar2);
        }
    }
}
