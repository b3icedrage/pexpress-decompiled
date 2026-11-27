package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class XB0 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    public interface a {
        int getNumber();
    }

    public interface b extends c<Integer> {
    }

    public interface c<E> extends List<E>, RandomAccess {
        void k();

        c<E> l(int i);

        boolean v();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new DE.a(bArr, 0, 0, false).a(0);
        } catch (C6934uC0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static AbstractC0595Ak0 c(Object obj, Object obj2) {
        AbstractC0595Ak0.a aVarB = ((GZ0) obj).b();
        GZ0 gz0 = (GZ0) obj2;
        if (!aVarB.d.getClass().isInstance(gz0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        aVarB.p();
        AbstractC0595Ak0.a.r(aVarB.e, (AbstractC0595Ak0) ((G0) gz0));
        return aVarB.o();
    }
}
