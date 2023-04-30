import { View, Text, ImageBackground, StyleSheet } from 'react-native';
const bg = require('./../../assets/imgs/background.png');
 
export interface LoginScreenProps {
}
 
export function LoginScreen(props: LoginScreenProps) {
      return (
          <ImageBackground source={bg} style={styles.background}>
              <View style={styles.container}>
                  <Text style={styles.logo}>APP</Text>
              </View>
          </ImageBackground>
      );
  }
 
  const styles = StyleSheet.create({
      background: {width:'100%', height:'100%'},
      container: {
          flex: 1,
          justifyContent: 'center',
          padding: 10,
          alignItems: 'stretch'
      },
      logo: { color: 'white', fontSize: 50, textAlign: 'center'}
});
