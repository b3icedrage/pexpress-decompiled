package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class C7652xe implements InterfaceC1377Kl, J71 {

    @NotNull
    public static final GW1 d = new GW1("CONDITION_FALSE");

    @NotNull
    public static final C7652xe e = new C7652xe();
    public static final String[] g = {" ", "  ", "    ", "        ", "                ", "                                "};

    @NotNull
    public static final C2836aw a(@NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(content, 0, length);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(content, offset, length)");
        return new C2836aw(byteBufferWrap);
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static String c(AbstractC1646Nw abstractC1646Nw) {
        StringBuilder sb = new StringBuilder(abstractC1646Nw.size());
        for (int i = 0; i < abstractC1646Nw.size(); i++) {
            byte bA = abstractC1646Nw.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static Drawable d(@NonNull Context context, int i) {
        return C6447rt1.b().c(context, i);
    }

    @NotNull
    public static final LifecycleCoroutineScopeImpl f(@NotNull FP0 fp0) {
        Intrinsics.checkNotNullParameter(fp0, "<this>");
        g lifecycle = fp0.getLifecycle();
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.a.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            C4002gV1 c4002gV1A = C0564Aa.a();
            RV rv = C6266r20.a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, CoroutineContext.Element.a.c(c4002gV1A, QV0.a.s1()));
            AtomicReference<Object> atomicReference = lifecycle.a;
            do {
                if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                    RV rv2 = C6266r20.a;
                    C5189lv.k(lifecycleCoroutineScopeImpl2, QV0.a.s1(), new i(lifecycleCoroutineScopeImpl2, null), 2);
                    return lifecycleCoroutineScopeImpl2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final boolean g(@NotNull EnumC3495e41 enumC3495e41) {
        Intrinsics.checkNotNullParameter(enumC3495e41, "<this>");
        return (enumC3495e41 == EnumC3495e41.d || enumC3495e41 == EnumC3495e41.e) ? false : true;
    }

    public static final void h(int i, StringBuilder sb) {
        String[] strArr;
        while (true) {
            strArr = g;
            if (i < 32) {
                break;
            }
            sb.append(strArr[5]);
            i -= 32;
        }
        for (int i2 = 4; i2 >= 0; i2--) {
            if (((1 << i2) & i) != 0) {
                sb.append(strArr[i2]);
            }
        }
    }

    public static final boolean i(@NotNull AbstractC1091Gt1 abstractC1091Gt1) {
        Intrinsics.checkNotNullParameter(abstractC1091Gt1, "<this>");
        C3024bo1 c3024bo1Peek = abstractC1091Gt1.k().peek();
        while (c3024bo1Peek.s(1L)) {
            char cG = (char) c3024bo1Peek.g();
            if (!CharsKt.c(cG)) {
                return cG == '{';
            }
        }
        return false;
    }

    @Override // defpackage.J71
    public Object e() {
        return new ConcurrentSkipListMap();
    }
}
