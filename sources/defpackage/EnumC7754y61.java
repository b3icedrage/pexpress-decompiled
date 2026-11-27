package defpackage;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7754y61 {
    public static final EnumC7754y61 d;
    public static final /* synthetic */ EnumC7754y61[] e;

    /* JADX INFO: renamed from: y61$a */
    public static final class a implements Serializable {
        public final Throwable d;

        public a(Throwable th) {
            this.d = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).d;
            Throwable th = this.d;
            if (th != obj2) {
                return th != null && th.equals(obj2);
            }
            return true;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.d + "]";
        }
    }

    /* JADX INFO: renamed from: y61$b */
    public static final class b implements Serializable {
        public final InterfaceC6779tU1 d;

        public b(InterfaceC6779tU1 interfaceC6779tU1) {
            this.d = interfaceC6779tU1;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.d + "]";
        }
    }

    static {
        EnumC7754y61 enumC7754y61 = new EnumC7754y61("COMPLETE", 0);
        d = enumC7754y61;
        e = new EnumC7754y61[]{enumC7754y61};
    }

    public EnumC7754y61() {
        throw null;
    }

    public static EnumC7754y61 valueOf(String str) {
        return (EnumC7754y61) Enum.valueOf(EnumC7754y61.class, str);
    }

    public static EnumC7754y61[] values() {
        return (EnumC7754y61[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
