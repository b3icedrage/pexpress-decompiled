package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018JF\u0010 \u001a\u00020\n\"\u0010\b\u0000\u0010\u001a\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0086\b¢\u0006\u0004\b \u0010!J=\u0010#\u001a\u00020\n\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J=\u0010%\u001a\u00020\n\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J1\u0010'\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J1\u0010)\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001e2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*J1\u0010,\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020+2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b,\u0010-J1\u0010/\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020.2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b/\u00100J1\u00102\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u0002012\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b2\u00103J1\u00105\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u0002042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b5\u00106J1\u00108\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u0002072\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b8\u00109J1\u0010;\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020:2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b;\u0010<JH\u0010=\u001a\u00020\n\"\u0010\b\u0000\u0010\u001a\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0086\b¢\u0006\u0004\b=\u0010!J?\u0010>\u001a\u00020\n\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b>\u0010$J?\u0010?\u001a\u00020\n\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b?\u0010&J3\u0010@\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b@\u0010(J3\u0010A\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bA\u0010BJ3\u0010C\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bC\u0010DJ3\u0010E\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bE\u0010FJ3\u0010G\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u0001012\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bG\u0010HJ3\u0010I\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u0001042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bI\u0010JJ3\u0010K\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u0001072\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bK\u00109J3\u0010L\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bL\u0010<J\u0015\u0010M\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\bM\u0010NJ*\u0010O\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u001a\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0084\b¢\u0006\u0004\bO\u0010PJ;\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0016\b\u0002\u0010R\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0018\u00010QH\u0004¢\u0006\u0004\bS\u0010TJ;\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0016\b\u0002\u0010R\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0018\u00010QH\u0004¢\u0006\u0004\bU\u0010VJ)\u0010W\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010QH\u0004¢\u0006\u0004\bW\u0010XJ)\u0010Y\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010QH\u0004¢\u0006\u0004\bY\u0010ZJ)\u0010[\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010QH\u0004¢\u0006\u0004\b[\u0010\\J)\u0010]\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010QH\u0004¢\u0006\u0004\b]\u0010^J)\u0010_\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010QH\u0004¢\u0006\u0004\b_\u0010`J)\u0010a\u001a\u0002042\u0006\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010QH\u0004¢\u0006\u0004\ba\u0010bJ)\u0010c\u001a\u0002072\u0006\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010QH\u0004¢\u0006\u0004\bc\u0010dJ)\u0010e\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010QH\u0004¢\u0006\u0004\be\u0010fJ,\u0010g\u001a\u0004\u0018\u00018\u0000\"\u0010\b\u0000\u0010\u001a\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0084\b¢\u0006\u0004\bg\u0010PJ?\u0010h\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0018\b\u0002\u0010R\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"\u0018\u00010QH\u0004¢\u0006\u0004\bh\u0010TJ?\u0010i\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0018\b\u0002\u0010R\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016\u0018\u00010QH\u0004¢\u0006\u0004\bi\u0010VJ-\u0010j\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0012\b\u0002\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010QH\u0004¢\u0006\u0004\bj\u0010XJ-\u0010k\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u00042\u0012\b\u0002\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010QH\u0004¢\u0006\u0004\bk\u0010lJ-\u0010m\u001a\u0004\u0018\u00010+2\u0006\u0010\u001b\u001a\u00020\u00042\u0012\b\u0002\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010+\u0018\u00010QH\u0004¢\u0006\u0004\bm\u0010nJ-\u0010o\u001a\u0004\u0018\u0001012\u0006\u0010\u001b\u001a\u00020\u00042\u0012\b\u0002\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010QH\u0004¢\u0006\u0004\bo\u0010pJ-\u0010q\u001a\u0004\u0018\u00010.2\u0006\u0010\u001b\u001a\u00020\u00042\u0012\b\u0002\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010QH\u0004¢\u0006\u0004\bq\u0010rJ-\u0010s\u001a\u0004\u0018\u0001042\u0006\u0010\u001b\u001a\u00020\u00042\u0012\b\u0002\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u000104\u0018\u00010QH\u0004¢\u0006\u0004\bs\u0010tJ-\u0010u\u001a\u0004\u0018\u0001072\u0006\u0010\u001b\u001a\u00020\u00042\u0012\b\u0002\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u00010QH\u0004¢\u0006\u0004\bu\u0010dJ-\u0010v\u001a\u0004\u0018\u00010:2\u0006\u0010\u001b\u001a\u00020\u00042\u0012\b\u0002\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010:\u0018\u00010QH\u0004¢\u0006\u0004\bv\u0010fJ\r\u0010w\u001a\u00020\b¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\n2\u0006\u0010y\u001a\u00020\u0002H\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\n2\u0006\u0010y\u001a\u00020\u0002H\u0016¢\u0006\u0004\b|\u0010{J>\u0010\u0080\u0001\u001a\u00020\n2\u0006\u0010}\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010~\u001a\u0004\u0018\u00010:2\b\u0010\u007f\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0003\u0010\u0082\u0001R\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0083\u0001R.\u0010\u0085\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010:0\u0084\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R(\u0010\r\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"LD01;", "LCs0;", "Ltt0;", "_parentModel", "", "_parentProperty", "<init>", "(LD01;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "jsonObject", "", "initializeFromJson", "(Lorg/json/JSONObject;)V", "id", "model", "initializeFromModel", "(Ljava/lang/String;LD01;)V", "property", "createModelForProperty", "(Ljava/lang/String;Lorg/json/JSONObject;)LD01;", "Lorg/json/JSONArray;", "jsonArray", "", "createListForProperty", "(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List;", "", "T", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "tag", "", "forceChange", "setEnumProperty", "(Ljava/lang/String;Ljava/lang/Enum;Ljava/lang/String;Z)V", "LHW0;", "setMapModelProperty", "(Ljava/lang/String;LHW0;Ljava/lang/String;Z)V", "setListProperty", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "setStringProperty", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "setBooleanProperty", "(Ljava/lang/String;ZLjava/lang/String;Z)V", "", "setLongProperty", "(Ljava/lang/String;JLjava/lang/String;Z)V", "", "setDoubleProperty", "(Ljava/lang/String;DLjava/lang/String;Z)V", "", "setFloatProperty", "(Ljava/lang/String;FLjava/lang/String;Z)V", "", "setIntProperty", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Ljava/math/BigDecimal;", "setBigDecimalProperty", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Z)V", "", "setAnyProperty", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Z)V", "setOptEnumProperty", "setOptMapModelProperty", "setOptListProperty", "setOptStringProperty", "setOptBooleanProperty", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V", "setOptLongProperty", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z)V", "setOptDoubleProperty", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Z)V", "setOptFloatProperty", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)V", "setOptIntProperty", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V", "setOptBigDecimalProperty", "setOptAnyProperty", "hasProperty", "(Ljava/lang/String;)Z", "getEnumProperty", "(Ljava/lang/String;)Ljava/lang/Enum;", "Lkotlin/Function0;", "create", "getMapModelProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)LHW0;", "getListProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/util/List;", "getStringProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "getBooleanProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Z", "getLongProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)J", "getDoubleProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)D", "getFloatProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)F", "getIntProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)I", "getBigDecimalProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/math/BigDecimal;", "getAnyProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOptEnumProperty", "getOptMapModelProperty", "getOptListProperty", "getOptStringProperty", "getOptBooleanProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Boolean;", "getOptLongProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Long;", "getOptFloatProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Float;", "getOptDoubleProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Double;", "getOptIntProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Integer;", "getOptBigDecimalProperty", "getOptAnyProperty", "toJSON", "()Lorg/json/JSONObject;", "handler", "subscribe", "(Ltt0;)V", "unsubscribe", "path", "oldValue", "newValue", "notifyChanged", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "LD01;", "Ljava/lang/String;", "", "data", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "LO80;", "changeNotifier", "LO80;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getHasSubscribers", "()Z", "hasSubscribers", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class D01 implements InterfaceC0775Cs0<InterfaceC6866tt0> {

    @Nullable
    private D01 _parentModel;

    @Nullable
    private final String _parentProperty;

    @NotNull
    private final O80<InterfaceC6866tt0> changeNotifier;

    @NotNull
    private final Map<String, Object> data;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltt0;", "it", "", "invoke", "(Ltt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC6866tt0, Unit> {
        final /* synthetic */ H01 $changeArgs;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H01 h01, String str) {
            super(1);
            this.$changeArgs = h01;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6866tt0 interfaceC6866tt0) {
            invoke2(interfaceC6866tt0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC6866tt0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onChanged(this.$changeArgs, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D01() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getAnyProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnyProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getAnyProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getBigDecimalProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean getBooleanProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getBooleanProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ double getDoubleProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoubleProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getDoubleProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float getFloatProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloatProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getFloatProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int getIntProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getIntProperty(str, function0);
    }

    public static /* synthetic */ List getListProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getListProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ long getLongProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLongProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getLongProperty(str, function0);
    }

    public static /* synthetic */ HW0 getMapModelProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapModelProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getMapModelProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOptAnyProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptAnyProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptBigDecimalProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Boolean getOptBooleanProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptBooleanProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Double getOptDoubleProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptDoubleProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Float getOptFloatProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptFloatProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Integer getOptIntProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptIntProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptIntProperty(str, function0);
    }

    public static /* synthetic */ List getOptListProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptListProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptListProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Long getOptLongProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptLongProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptLongProperty(str, function0);
    }

    public static /* synthetic */ HW0 getOptMapModelProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptMapModelProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getOptStringProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptStringProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getOptStringProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getStringProperty$default(D01 d01, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return d01.getStringProperty(str, function0);
    }

    private final void notifyChanged(String path, String property, String tag, Object oldValue, Object newValue) {
        this.changeNotifier.fire(new a(new H01(this, path, property, oldValue, newValue), tag));
        if (this._parentModel != null) {
            String str = this._parentProperty + JwtParser.SEPARATOR_CHAR + path;
            D01 d01 = this._parentModel;
            Intrinsics.checkNotNull(d01);
            d01.notifyChanged(str, property, tag, oldValue, newValue);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(D01 d01, String str, Object obj, String str2, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnyProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setAnyProperty(str, obj, str2, z);
    }

    public static /* synthetic */ void setBigDecimalProperty$default(D01 d01, String str, BigDecimal bigDecimal, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public static /* synthetic */ void setBooleanProperty$default(D01 d01, String str, boolean z, String str2, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        d01.setBooleanProperty(str, z, str2, z2);
    }

    public static /* synthetic */ void setDoubleProperty$default(D01 d01, String str, double d, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDoubleProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setDoubleProperty(str, d, str3, z);
    }

    public static /* synthetic */ void setEnumProperty$default(D01 d01, String name, Enum value, String tag, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnumProperty");
        }
        if ((i & 4) != 0) {
            tag = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        d01.setOptAnyProperty(name, value.toString(), tag, z);
    }

    public static /* synthetic */ void setFloatProperty$default(D01 d01, String str, float f, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFloatProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setFloatProperty(str, f, str2, z);
    }

    public static /* synthetic */ void setIntProperty$default(D01 d01, String str, int i, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIntProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        d01.setIntProperty(str, i, str2, z);
    }

    public static /* synthetic */ void setListProperty$default(D01 d01, String str, List list, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setListProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setListProperty(str, list, str2, z);
    }

    public static /* synthetic */ void setLongProperty$default(D01 d01, String str, long j, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLongProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setLongProperty(str, j, str3, z);
    }

    public static /* synthetic */ void setMapModelProperty$default(D01 d01, String str, HW0 hw0, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapModelProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setMapModelProperty(str, hw0, str2, z);
    }

    public static /* synthetic */ void setOptAnyProperty$default(D01 d01, String str, Object obj, String str2, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptAnyProperty(str, obj, str2, z);
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(D01 d01, String str, BigDecimal bigDecimal, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public static /* synthetic */ void setOptBooleanProperty$default(D01 d01, String str, Boolean bool, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptBooleanProperty(str, bool, str2, z);
    }

    public static /* synthetic */ void setOptDoubleProperty$default(D01 d01, String str, Double d, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptDoubleProperty(str, d, str2, z);
    }

    public static /* synthetic */ void setOptEnumProperty$default(D01 d01, String name, Enum r2, String tag, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
        }
        if ((i & 4) != 0) {
            tag = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        d01.setOptAnyProperty(name, r2 != null ? r2.toString() : null, tag, z);
    }

    public static /* synthetic */ void setOptFloatProperty$default(D01 d01, String str, Float f, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptFloatProperty(str, f, str2, z);
    }

    public static /* synthetic */ void setOptIntProperty$default(D01 d01, String str, Integer num, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptIntProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptIntProperty(str, num, str2, z);
    }

    public static /* synthetic */ void setOptListProperty$default(D01 d01, String str, List list, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptListProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptListProperty(str, list, str2, z);
    }

    public static /* synthetic */ void setOptLongProperty$default(D01 d01, String str, Long l, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptLongProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptLongProperty(str, l, str2, z);
    }

    public static /* synthetic */ void setOptMapModelProperty$default(D01 d01, String str, HW0 hw0, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptMapModelProperty(str, hw0, str2, z);
    }

    public static /* synthetic */ void setOptStringProperty$default(D01 d01, String str, String str2, String str3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptStringProperty");
        }
        if ((i & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setOptStringProperty(str, str2, str3, z);
    }

    public static /* synthetic */ void setStringProperty$default(D01 d01, String str, String str2, String str3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStringProperty");
        }
        if ((i & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        d01.setStringProperty(str, str2, str3, z);
    }

    @Nullable
    public List<?> createListForProperty(@NotNull String property, @NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        return null;
    }

    @Nullable
    public D01 createModelForProperty(@NotNull String property, @NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        return null;
    }

    @NotNull
    public final Object getAnyProperty(@NotNull String name, @Nullable Function0<? extends Object> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, create);
        Intrinsics.c(optAnyProperty, "null cannot be cast to non-null type kotlin.Any");
        return optAnyProperty;
    }

    @NotNull
    public final BigDecimal getBigDecimalProperty(@NotNull String name, @Nullable Function0<? extends BigDecimal> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(name, create);
        Intrinsics.c(optBigDecimalProperty, "null cannot be cast to non-null type java.math.BigDecimal");
        return optBigDecimalProperty;
    }

    public final boolean getBooleanProperty(@NotNull String name, @Nullable Function0<Boolean> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Boolean optBooleanProperty = getOptBooleanProperty(name, create);
        Intrinsics.c(optBooleanProperty, "null cannot be cast to non-null type kotlin.Boolean");
        return optBooleanProperty.booleanValue();
    }

    @NotNull
    public final Map<String, Object> getData() {
        return this.data;
    }

    public final double getDoubleProperty(@NotNull String name, @Nullable Function0<Double> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Double optDoubleProperty = getOptDoubleProperty(name, create);
        Intrinsics.c(optDoubleProperty, "null cannot be cast to non-null type kotlin.Double");
        return optDoubleProperty.doubleValue();
    }

    public final /* synthetic */ <T extends Enum<T>> T getEnumProperty(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (getOptAnyProperty$default(this, name, null, 2, null) == null) {
            Intrinsics.h();
            throw null;
        }
        Intrinsics.h();
        throw null;
    }

    public final float getFloatProperty(@NotNull String name, @Nullable Function0<Float> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Float optFloatProperty = getOptFloatProperty(name, create);
        Intrinsics.c(optFloatProperty, "null cannot be cast to non-null type kotlin.Float");
        return optFloatProperty.floatValue();
    }

    @Override // defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    @NotNull
    public final String getId() {
        return getStringProperty$default(this, "id", null, 2, null);
    }

    public final int getIntProperty(@NotNull String name, @Nullable Function0<Integer> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer optIntProperty = getOptIntProperty(name, create);
        Intrinsics.c(optIntProperty, "null cannot be cast to non-null type kotlin.Int");
        return optIntProperty.intValue();
    }

    @NotNull
    public final <T> List<T> getListProperty(@NotNull String name, @Nullable Function0<? extends List<? extends T>> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<T> optListProperty = getOptListProperty(name, create);
        Intrinsics.c(optListProperty, "null cannot be cast to non-null type kotlin.collections.List<T of com.onesignal.common.modeling.Model.getListProperty>");
        return optListProperty;
    }

    public final long getLongProperty(@NotNull String name, @Nullable Function0<Long> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Long optLongProperty = getOptLongProperty(name, create);
        Intrinsics.c(optLongProperty, "null cannot be cast to non-null type kotlin.Long");
        return optLongProperty.longValue();
    }

    @NotNull
    public final <T> HW0<T> getMapModelProperty(@NotNull String name, @Nullable Function0<? extends HW0<T>> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        HW0<T> optMapModelProperty = getOptMapModelProperty(name, create);
        Intrinsics.c(optMapModelProperty, "null cannot be cast to non-null type com.onesignal.common.modeling.MapModel<T of com.onesignal.common.modeling.Model.getMapModelProperty>");
        return optMapModelProperty;
    }

    @Nullable
    public final Object getOptAnyProperty(@NotNull String name, @Nullable Function0<? extends Object> create) {
        Object objInvoke;
        Intrinsics.checkNotNullParameter(name, "name");
        synchronized (this.data) {
            try {
                if (this.data.containsKey(name) || create == null) {
                    objInvoke = this.data.get(name);
                } else {
                    objInvoke = create.invoke();
                    this.data.put(name, objInvoke);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objInvoke;
    }

    @Nullable
    public final BigDecimal getOptBigDecimalProperty(@NotNull String name, @Nullable Function0<? extends BigDecimal> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, create);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Integer) {
            return new BigDecimal(((Number) optAnyProperty).intValue());
        }
        if (optAnyProperty instanceof Long) {
            return new BigDecimal(((Number) optAnyProperty).longValue());
        }
        if (optAnyProperty instanceof Float) {
            return new BigDecimal(((Number) optAnyProperty).floatValue());
        }
        if (optAnyProperty instanceof Double) {
            return new BigDecimal(((Number) optAnyProperty).doubleValue());
        }
        return optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    @Nullable
    public final Boolean getOptBooleanProperty(@NotNull String name, @Nullable Function0<Boolean> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (Boolean) getOptAnyProperty(name, create);
    }

    @Nullable
    public final Double getOptDoubleProperty(@NotNull String name, @Nullable Function0<Double> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, create);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Double) {
            return (Double) optAnyProperty;
        }
        if (optAnyProperty instanceof Float) {
            return Double.valueOf(((Number) optAnyProperty).floatValue());
        }
        if (optAnyProperty instanceof Integer) {
            return Double.valueOf(((Number) optAnyProperty).intValue());
        }
        return optAnyProperty instanceof Long ? Double.valueOf(((Number) optAnyProperty).longValue()) : (Double) optAnyProperty;
    }

    public final /* synthetic */ <T extends Enum<T>> T getOptEnumProperty(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (getOptAnyProperty$default(this, name, null, 2, null) == null) {
            return null;
        }
        Intrinsics.h();
        throw null;
    }

    @Nullable
    public final Float getOptFloatProperty(@NotNull String name, @Nullable Function0<Float> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, create);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Float) {
            return (Float) optAnyProperty;
        }
        if (optAnyProperty instanceof Double) {
            return Float.valueOf((float) ((Number) optAnyProperty).doubleValue());
        }
        if (optAnyProperty instanceof Integer) {
            return Float.valueOf(((Number) optAnyProperty).intValue());
        }
        return optAnyProperty instanceof Long ? Float.valueOf(((Number) optAnyProperty).longValue()) : (Float) optAnyProperty;
    }

    @Nullable
    public final Integer getOptIntProperty(@NotNull String name, @Nullable Function0<Integer> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, create);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Integer) {
            return (Integer) optAnyProperty;
        }
        if (optAnyProperty instanceof Long) {
            return Integer.valueOf((int) ((Number) optAnyProperty).longValue());
        }
        if (optAnyProperty instanceof Float) {
            return Integer.valueOf((int) ((Number) optAnyProperty).floatValue());
        }
        return optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    @Nullable
    public final <T> List<T> getOptListProperty(@NotNull String name, @Nullable Function0<? extends List<? extends T>> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (List) getOptAnyProperty(name, create);
    }

    @Nullable
    public final Long getOptLongProperty(@NotNull String name, @Nullable Function0<Long> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, create);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Long) {
            return (Long) optAnyProperty;
        }
        if (optAnyProperty instanceof Integer) {
            return Long.valueOf(((Number) optAnyProperty).intValue());
        }
        if (optAnyProperty instanceof Float) {
            return Long.valueOf((long) ((Number) optAnyProperty).floatValue());
        }
        return optAnyProperty instanceof Double ? Long.valueOf((long) ((Number) optAnyProperty).doubleValue()) : (Long) optAnyProperty;
    }

    @Nullable
    public final <T> HW0<T> getOptMapModelProperty(@NotNull String name, @Nullable Function0<? extends HW0<T>> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (HW0) getOptAnyProperty(name, create);
    }

    @Nullable
    public final String getOptStringProperty(@NotNull String name, @Nullable Function0<String> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (String) getOptAnyProperty(name, create);
    }

    @NotNull
    public final String getStringProperty(@NotNull String name, @Nullable Function0<String> create) {
        Intrinsics.checkNotNullParameter(name, "name");
        String optStringProperty = getOptStringProperty(name, create);
        Intrinsics.c(optStringProperty, "null cannot be cast to non-null type kotlin.String");
        return optStringProperty;
    }

    public final boolean hasProperty(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.data.containsKey(name);
    }

    public final void initializeFromJson(@NotNull JSONObject jsonObject) {
        Method method;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        synchronized (this.data) {
            try {
                this.data.clear();
                Iterator<String> itKeys = jsonObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
                while (itKeys.hasNext()) {
                    String property = itKeys.next();
                    Object obj = jsonObject.get(property);
                    if (obj instanceof JSONObject) {
                        Intrinsics.checkNotNullExpressionValue(property, "property");
                        D01 d01CreateModelForProperty = createModelForProperty(property, (JSONObject) obj);
                        if (d01CreateModelForProperty != null) {
                            this.data.put(property, d01CreateModelForProperty);
                        }
                    } else if (obj instanceof JSONArray) {
                        Intrinsics.checkNotNullExpressionValue(property, "property");
                        List<?> listCreateListForProperty = createListForProperty(property, (JSONArray) obj);
                        if (listCreateListForProperty != null) {
                            this.data.put(property, listCreateListForProperty);
                        }
                    } else {
                        Method[] methods = getClass().getMethods();
                        Intrinsics.checkNotNullExpressionValue(methods, "this.javaClass.methods");
                        int length = methods.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i];
                            if (!Intrinsics.a(method.getReturnType(), Void.class)) {
                                if (d.i(method.getName(), "get" + property)) {
                                    break;
                                }
                            }
                            i++;
                        }
                        Class<?> returnType = method != null ? method.getReturnType() : null;
                        if (Intrinsics.a(returnType, Double.TYPE) ? true : Intrinsics.a(returnType, Double.class)) {
                            Map<String, Object> map = this.data;
                            Intrinsics.checkNotNullExpressionValue(property, "property");
                            map.put(property, Double.valueOf(jsonObject.getDouble(property)));
                        } else {
                            if (Intrinsics.a(returnType, Long.TYPE) ? true : Intrinsics.a(returnType, Long.class)) {
                                Map<String, Object> map2 = this.data;
                                Intrinsics.checkNotNullExpressionValue(property, "property");
                                map2.put(property, Long.valueOf(jsonObject.getLong(property)));
                            } else {
                                if (Intrinsics.a(returnType, Float.TYPE) ? true : Intrinsics.a(returnType, Float.class)) {
                                    Map<String, Object> map3 = this.data;
                                    Intrinsics.checkNotNullExpressionValue(property, "property");
                                    map3.put(property, Float.valueOf((float) jsonObject.getDouble(property)));
                                } else {
                                    if (Intrinsics.a(returnType, Integer.TYPE) ? true : Intrinsics.a(returnType, Integer.class)) {
                                        Map<String, Object> map4 = this.data;
                                        Intrinsics.checkNotNullExpressionValue(property, "property");
                                        map4.put(property, Integer.valueOf(jsonObject.getInt(property)));
                                    } else {
                                        if (Intrinsics.a(returnType, Boolean.TYPE) ? true : Intrinsics.a(returnType, Boolean.class)) {
                                            Map<String, Object> map5 = this.data;
                                            Intrinsics.checkNotNullExpressionValue(property, "property");
                                            map5.put(property, Boolean.valueOf(jsonObject.getBoolean(property)));
                                        } else {
                                            if (Intrinsics.a(returnType, String.class) ? true : Intrinsics.a(returnType, String.class)) {
                                                Map<String, Object> map6 = this.data;
                                                Intrinsics.checkNotNullExpressionValue(property, "property");
                                                map6.put(property, jsonObject.getString(property));
                                            } else {
                                                Map<String, Object> map7 = this.data;
                                                Intrinsics.checkNotNullExpressionValue(property, "property");
                                                map7.put(property, jsonObject.get(property));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void initializeFromModel(@Nullable String id, @NotNull D01 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Map<? extends String, ? extends Object> newData = Collections.synchronizedMap(new LinkedHashMap());
        for (Map.Entry<String, Object> entry : model.data.entrySet()) {
            if (entry.getValue() instanceof D01) {
                Object value = entry.getValue();
                Intrinsics.c(value, "null cannot be cast to non-null type com.onesignal.common.modeling.Model");
                D01 d01 = (D01) value;
                d01._parentModel = this;
                Intrinsics.checkNotNullExpressionValue(newData, "newData");
                newData.put(entry.getKey(), d01);
            } else {
                Intrinsics.checkNotNullExpressionValue(newData, "newData");
                newData.put(entry.getKey(), entry.getValue());
            }
        }
        if (id != null) {
            Intrinsics.checkNotNullExpressionValue(newData, "newData");
            newData.put("id", id);
        }
        synchronized (this.data) {
            this.data.clear();
            Map<String, Object> map = this.data;
            Intrinsics.checkNotNullExpressionValue(newData, "newData");
            map.putAll(newData);
            Unit unit = Unit.a;
        }
    }

    public final void setAnyProperty(@NotNull String name, @NotNull Object value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final void setBigDecimalProperty(@NotNull String name, @NotNull BigDecimal value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptBigDecimalProperty(name, value, tag, forceChange);
    }

    public final void setBooleanProperty(@NotNull String name, boolean value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptBooleanProperty(name, Boolean.valueOf(value), tag, forceChange);
    }

    public final void setDoubleProperty(@NotNull String name, double value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptDoubleProperty(name, Double.valueOf(value), tag, forceChange);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String name, T value, String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value.toString(), tag, forceChange);
    }

    public final void setFloatProperty(@NotNull String name, float value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptFloatProperty(name, Float.valueOf(value), tag, forceChange);
    }

    public final void setId(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setStringProperty$default(this, "id", value, null, false, 12, null);
    }

    public final void setIntProperty(@NotNull String name, int value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptIntProperty(name, Integer.valueOf(value), tag, forceChange);
    }

    public final <T> void setListProperty(@NotNull String name, @NotNull List<? extends T> value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptListProperty(name, value, tag, forceChange);
    }

    public final void setLongProperty(@NotNull String name, long value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptLongProperty(name, Long.valueOf(value), tag, forceChange);
    }

    public final <T> void setMapModelProperty(@NotNull String name, @NotNull HW0<T> value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptMapModelProperty(name, value, tag, forceChange);
    }

    public final void setOptAnyProperty(@NotNull String name, @Nullable Object value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object obj = this.data.get(name);
        synchronized (this.data) {
            try {
                if (!Intrinsics.a(obj, value) || forceChange) {
                    if (value != null) {
                        this.data.put(name, value);
                    } else if (this.data.containsKey(name)) {
                        this.data.remove(name);
                    }
                    Unit unit = Unit.a;
                    notifyChanged(name, name, tag, obj, value);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setOptBigDecimalProperty(@NotNull String name, @Nullable BigDecimal value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value != null ? value.toString() : null, tag, forceChange);
    }

    public final void setOptBooleanProperty(@NotNull String name, @Nullable Boolean value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final void setOptDoubleProperty(@NotNull String name, @Nullable Double value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String name, T value, String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value != null ? value.toString() : null, tag, forceChange);
    }

    public final void setOptFloatProperty(@NotNull String name, @Nullable Float value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final void setOptIntProperty(@NotNull String name, @Nullable Integer value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final <T> void setOptListProperty(@NotNull String name, @Nullable List<? extends T> value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final void setOptLongProperty(@NotNull String name, @Nullable Long value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final <T> void setOptMapModelProperty(@NotNull String name, @Nullable HW0<T> value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final void setOptStringProperty(@NotNull String name, @Nullable String value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, forceChange);
    }

    public final void setStringProperty(@NotNull String name, @NotNull String value, @NotNull String tag, boolean forceChange) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptStringProperty(name, value, tag, forceChange);
    }

    @NotNull
    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        synchronized (this.data) {
            try {
                for (Map.Entry<String, Object> entry : this.data.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof D01) {
                        jSONObject.put(entry.getKey(), ((D01) value).toJSON());
                    } else if (value instanceof List) {
                        JSONArray jSONArray = new JSONArray();
                        for (Object obj : (List) value) {
                            if (obj instanceof D01) {
                                jSONArray.put(((D01) obj).toJSON());
                            } else {
                                jSONArray.put(obj);
                            }
                        }
                        jSONObject.put(entry.getKey(), jSONArray);
                    } else {
                        jSONObject.put(entry.getKey(), value);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    public D01(@Nullable D01 d01, @Nullable String str) throws Exception {
        this._parentModel = d01;
        this._parentProperty = str;
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.data = mapSynchronizedMap;
        this.changeNotifier = new O80<>();
        D01 d02 = this._parentModel;
        if (d02 != null && str == null) {
            throw new Exception("If parent model is set, parent property must also be set.");
        }
        if (d02 == null && str != null) {
            throw new Exception("If parent property is set, parent model must also be set.");
        }
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC6866tt0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeNotifier.subscribe(handler);
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC6866tt0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeNotifier.unsubscribe(handler);
    }

    public /* synthetic */ D01(D01 d01, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d01, (i & 2) != 0 ? null : str);
    }
}
