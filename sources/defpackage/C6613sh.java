package defpackage;

import java.io.Serializable;
import kotlin.Unit;

/* JADX INFO: renamed from: sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.tool.AppImpl$wireSentryUserContext$2", f = "AppImpl.kt", l = {}, m = "invokeSuspend")
public final class C6613sh extends AW1 implements InterfaceC1216Ij0<C6945uG, Boolean, Boolean, Boolean, JM<? super C8001zH1>, Object> {
    public /* synthetic */ C6945uG d;
    public /* synthetic */ boolean e;
    public /* synthetic */ Boolean g;
    public /* synthetic */ boolean h;

    @Override // defpackage.InterfaceC1216Ij0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        C6613sh c6613sh = new C6613sh(5, (JM) serializable);
        c6613sh.d = (C6945uG) obj;
        c6613sh.e = zBooleanValue;
        c6613sh.g = (Boolean) obj3;
        c6613sh.h = zBooleanValue2;
        return c6613sh.invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C6945uG c6945uG = this.d;
        boolean z = this.e;
        Boolean bool = this.g;
        boolean z2 = this.h;
        if (c6945uG == null || !z) {
            c6945uG = null;
            str = null;
        } else {
            str = null;
        }
        String string = c6945uG != null ? new Long(c6945uG.a).toString() : str;
        String str4 = c6945uG != null ? c6945uG.b : str;
        if (c6945uG != null) {
            str3 = str4;
            str2 = c6945uG.d;
        } else {
            String str5 = str4;
            str2 = str;
            str3 = str5;
        }
        return new C8001zH1(string, str3, str2, z, bool, z2);
    }
}
