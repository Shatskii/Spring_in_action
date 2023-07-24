package com.shatskii.spring_in_action.controller;

//
//@Controller
//@RequestMapping("example")
//@SessionAttributes("myObject")
public class MyController {

//    @ModelAttribute("myObject")
//    public Ingredient getIngredient() {
//        return new Ingredient("KZ", "name", Ingredient.Type.CHEESE);
//    }
//
//    @GetMapping("/difference")
//    public String exam(Model model, HttpServletRequest request, HttpSession session) {
//        System.out.println("model attributes");
//        Map<String, Object> stringObjectMap = model.asMap();
//        for (String o : stringObjectMap.keySet()) {
//            Object attribute = stringObjectMap.get(o);
//            if (attribute instanceof Ingredient) {
//                System.out.println(attribute);
//                request.setAttribute("myObject", attribute);
//            }
//        }
//        System.out.println("-----------------------------------");
//        System.out.println("httpServletRequest attributes");
//        Enumeration<String> attributeNames = request.getAttributeNames();
//        while (attributeNames.hasMoreElements()) {
//            Object attribute = request.getAttribute(attributeNames.nextElement());
//            if (attribute instanceof Ingredient) {
//                System.out.println(attribute);
//            }
//        }
//        System.out.println("-------------------------------------");
//        System.out.println("httpSession attributes");
//        Enumeration<String> attributeNames1 = session.getAttributeNames();
//        while (attributeNames1.hasMoreElements()) {
//            Object attribute = session.getAttribute(attributeNames1.nextElement());
//            if (attribute instanceof Ingredient) {
//                System.out.println(attribute);
//            }
//        }
//        return "example";
//    }

}
