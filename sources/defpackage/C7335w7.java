package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7335w7 extends AbstractC6076q7<Object> {
    public final /* synthetic */ AbstractC6705t7 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AbstractC5023l7<Object, Object> c;

    public C7335w7(AbstractC6705t7 abstractC6705t7, String str, AbstractC5023l7<Object, Object> abstractC5023l7) {
        this.a = abstractC6705t7;
        this.b = str;
        this.c = abstractC5023l7;
    }

    @Override // defpackage.AbstractC6076q7
    public final void a(Object obj) {
        AbstractC6705t7 abstractC6705t7 = this.a;
        LinkedHashMap linkedHashMap = abstractC6705t7.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC5023l7<Object, Object> abstractC5023l7 = this.c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5023l7 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        ArrayList arrayList = abstractC6705t7.d;
        arrayList.add(str);
        try {
            abstractC6705t7.b(iIntValue, abstractC5023l7, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    public final void b() {
        this.a.f(this.b);
    }
}
