package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lwq;", "LJM;", "", "LNN;", "Ljava/io/Serializable;", "completion", "<init>", "(LJM;)V", "LOt1;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(LJM;)LJM;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/Object;LJM;)LJM;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "LJM;", "getCompletion", "()LJM;", "getCallerFrame", "()LNN;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractC7487wq implements JM<Object>, NN, Serializable {

    @Nullable
    private final JM<Object> completion;

    public AbstractC7487wq(@Nullable JM<Object> jm) {
        this.completion = jm;
    }

    @NotNull
    public JM<Unit> create(@NotNull JM<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public NN getCallerFrame() {
        JM<Object> jm = this.completion;
        if (jm instanceof NN) {
            return (NN) jm;
        }
        return null;
    }

    @Nullable
    public final JM<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(this, "<this>");
        InterfaceC3368dU interfaceC3368dU = (InterfaceC3368dU) getClass().getAnnotation(InterfaceC3368dU.class);
        String str = null;
        if (interfaceC3368dU == null) {
            return null;
        }
        int iV = interfaceC3368dU.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC3368dU.l()[iIntValue] : -1;
        U01.a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        U01.a aVar = U01.c;
        U01.a aVar2 = U01.b;
        if (aVar == null) {
            try {
                U01.a aVar3 = new U01.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, new Class[0]));
                U01.c = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                U01.c = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2 && (method = aVar.a) != null && (objInvoke = method.invoke(getClass(), new Object[0])) != null && (method2 = aVar.b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = aVar.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = interfaceC3368dU.c();
        } else {
            strC = str + '/' + interfaceC3368dU.c();
        }
        return new StackTraceElement(strC, interfaceC3368dU.m(), interfaceC3368dU.f(), i);
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object result);

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object result) {
        JM<Object> frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            AbstractC7487wq abstractC7487wq = (AbstractC7487wq) frame;
            JM<Object> jm = abstractC7487wq.completion;
            Intrinsics.checkNotNull(jm);
            try {
                result = abstractC7487wq.invokeSuspend(result);
                if (result == MN.d) {
                    return;
                } else {
                    C1717Ot1.a aVar = C1717Ot1.e;
                }
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                result = C1795Pt1.a(th);
            }
            abstractC7487wq.releaseIntercepted();
            if (!(jm instanceof AbstractC7487wq)) {
                jm.resumeWith(result);
                return;
            }
            frame = jm;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public JM<Unit> create(@Nullable Object value, @NotNull JM<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
