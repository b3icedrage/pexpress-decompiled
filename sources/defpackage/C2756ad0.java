package defpackage;

import com.google.firebase.messaging.FirebaseMessagingRegistrar;

/* JADX INFO: renamed from: ad0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2756ad0 implements InterfaceC5056lH, C5690oH0.b, InterfaceC1608Nj0 {
    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "$set";
            case 2:
                return "$setOnce";
            case 3:
                return "$add";
            case 4:
                return "$append";
            case 5:
                return "$clearAll";
            case 6:
                return "$prepend";
            case 7:
                return "$unset";
            case 8:
                return "$preInsert";
            case 9:
                return "$postInsert";
            case 10:
                return "$remove";
            default:
                throw null;
        }
    }

    @Override // defpackage.C5690oH0.b
    public Object a() {
        return null;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        String str;
        C7129v8 c7129v8 = (C7129v8) obj;
        return (c7129v8 == null || (str = c7129v8.c) == null) ? "" : str;
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0(c1480Lt1);
    }
}
