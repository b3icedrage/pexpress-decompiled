package defpackage;

import F0.a;
import defpackage.F0;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0<MessageType extends F0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements IZ0 {
    protected int memoizedHashCode = 0;

    public static abstract class a<MessageType extends F0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements LZ0, Cloneable {
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.IZ0
    public final AbstractC1565Mw.f e() {
        try {
            int iF = ((AbstractC8097zk0) this).f(null);
            AbstractC1565Mw.f fVar = AbstractC1565Mw.e;
            byte[] bArr = new byte[iF];
            Logger logger = GE.f;
            GE.b bVar = new GE.b(iF, bArr);
            ((AbstractC8097zk0) this).b(bVar);
            if (bVar.i - bVar.j == 0) {
                return new AbstractC1565Mw.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public int f(InterfaceC7989zD1 interfaceC7989zD1) {
        int iC = c();
        if (iC != -1) {
            return iC;
        }
        int iG = interfaceC7989zD1.g(this);
        h(iG);
        return iG;
    }

    public void h(int i) {
        throw new UnsupportedOperationException();
    }
}
