package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: dL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3341dL implements J71<Object> {
    public final /* synthetic */ Constructor d;

    public C3341dL(Constructor constructor) {
        this.d = constructor;
    }

    @Override // defpackage.J71
    public final Object e() {
        Constructor constructor = this.d;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            C2437Xp1.a aVar = C2437Xp1.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + C2437Xp1.b(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + C2437Xp1.b(constructor) + "' with no args", e3.getCause());
        }
    }
}
